/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.service;

import io.github.wesleysugarfree.tmcloud.common.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.common.dto.ListResult;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper.SongMapper;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper.SongMapperExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("songService")
public class SongService {
    @Resource
    private SongMapper songMapper;

    @Resource
    private SongMapperExt songMapperExt;

    private static Logger logger = LoggerFactory.getLogger(SongService.class);


    public BaseResult<Song> addOne(Song song) {
        if(songMapper.insertSelective(song)>0){
            logger.info("添加歌曲: {} 成功.",song.getsTitle());
            return new BaseResult<>(true, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<Song> readOneById(int id) {
        return new BaseResult<>(true, songMapper.selectByPrimaryKey(id), "200", "Readed successful.");
    }

    public BaseResult<Song> updateOne(Song song) throws Exception {
        try {
            if (songMapper.updateByPrimaryKeySelective(song) > 0) {
                logger.info("歌曲「{},{}」更新成功. ", song.getsSongid(),song.getsTitle());
                return new BaseResult<>(true, song, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, song, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public ListResult<Song> search(Song song){
        return new ListResult<>(true,songMapperExt.selectSelective(song),"200","Searched successfully.");
    }
}
