/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.dao.service;

import io.github.wesleysugarfree.tmcloud.common.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.domain.Album;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.mapper.AlbumMapper;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.mapper.AlbumMapperExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("albumService")
public class AlbumService {
    @Resource
    private AlbumMapper albumMapper;

    @Resource
    private AlbumMapperExt albumMapperExt;

    private static Logger logger = LoggerFactory.getLogger(AlbumService.class);

    public BaseResult<Album> addOne(Album album) {
        if (albumMapper.insertSelective(album) > 0) {
            logger.info("添加专辑: {} 成功.", album.getsAtitle());
            return new BaseResult<>(true, album, "200", "Added successful.");
        }
        return new BaseResult<>(true, album, "500", "Added failure.");
    }

    public BaseResult<Album> readOneById(int id) {
        return new BaseResult<>(true, albumMapper.selectByPrimaryKey(id), "200", "Read successfully.");
    }

    public BaseResult<Album> updateOne(Album album) throws Exception {
        try {
            if (albumMapper.updateByPrimaryKeySelective(album) > 0) {
                logger.info("专辑「{},{}」更新成功. ", album.getsAid(), album.getsAtitle());
                return new BaseResult<>(true, album, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, album, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public BaseResult<Album> search(Album album) {
        logger.info("搜索专辑：{},{}", album.getsAtitle(), album.getsAdescp());
        return new BaseResult<>(true, albumMapperExt.selectSelective(album), "200", "Searched successfully.");
    }
}
