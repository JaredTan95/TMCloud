/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.service;

import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.repository.SongRepository;
import io.github.wesleysugarfree.tmcloud.provider.song.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service("songService")
public class SongService {
    @Resource
    private SongRepository repository;

    private static Logger logger = LoggerFactory.getLogger(SongService.class);

    public BaseResult<Song> addOne(Song song) {
        if (Objects.nonNull(repository.save(song))) {
            logger.info("添加歌曲: {} 成功.", song.getTitle());
            return new BaseResult<>(true, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<Song> readOneById(long id) {
        return new BaseResult<>(true, repository.findOne(id), "200", "Readed successful.");
    }

    public BaseResult<Song> readAllTopByVisited() {
        //TODO:默认显示点击率最高的歌曲，且分页显示。
        return null;
    }

    public BaseResult<Song> updateOne(Song song) throws Exception {
        try {
            //TODO:优化，下面逻辑删除也需要优化。
            Song songOld = repository.findOne(song.getId());

            song.setId(songOld.getId());
            song.setSingerId(songOld.getSingerId());
            song.setTitle(songOld.getTitle());
            song.setUrl(songOld.getUrl());
            song.setVisitedTotal(songOld.getVisitedTotal());
            song.setFavNum(songOld.getFavNum());
            song.setDloaded(songOld.getDloaded());
            song.setCover(songOld.getCover());
            song.setMvUrl(songOld.getMvUrl());
            song.setDescription(songOld.getDescription());
            //song.setUpdateTime(); 更新时间采取数据库本地时间

            if (Objects.nonNull(repository.save(song))) {
                logger.info("歌曲「{},{}」更新成功. ", song.getId(), song.getTitle());
                return new BaseResult<>(true, song, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, song, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //批量更新
   /* public BaseResult<Song> updateBatch(List<Song> lists) {
        return null;
    }*/

    public BaseResult<Song> search(String title,String description) {
        return new BaseResult<>(true, repository
                .findAllByIsDeletedIsAndTitleContainingOrDescriptionContainingOrderByVisitedTotalDesc(0,title, description),
                "200", "Searched successfully.");
    }

    public BaseResult<Object> deleteOne(long id) throws Exception {
        try {
            Song songOld = repository.findOne(id);

            Song song = new Song();

            song.setId(id);
            song.setSingerId(songOld.getSingerId());
            song.setTitle(songOld.getTitle());
            song.setUrl(songOld.getUrl());
            song.setVisitedTotal(songOld.getVisitedTotal());
            song.setFavNum(songOld.getFavNum());
            song.setDloaded(songOld.getDloaded());
            song.setCover(songOld.getCover());
            song.setMvUrl(songOld.getMvUrl());
            song.setDescription(songOld.getDescription());
            //song.setUpdateTime(); 更新时间采取数据库本地时间

            //逻辑删除歌曲
            song.setIsDeleted(1);

            if (Objects.nonNull(repository.save(song))) {
                logger.info("歌曲「{},{}」逻辑删除成功. ", song.getId(), song.getTitle());
                return new BaseResult<>(true, song, "200", "Logical Deleted successfully.");
            } else {
                return new BaseResult<>(false, song, "500", "Logical Deleted failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
