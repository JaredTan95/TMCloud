/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.album.dao.domain.Album;

import java.util.List;

public interface AlbumMapperExt {
    List<Album> selectSelective(Album album);
}