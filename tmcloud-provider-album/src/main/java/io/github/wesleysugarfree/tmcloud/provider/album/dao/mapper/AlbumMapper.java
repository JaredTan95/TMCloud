/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.album.dao.domain.Album;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer sAid);

    int insert(Album record);

    int insertSelective(Album record);

    Album selectByPrimaryKey(Integer sAid);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}