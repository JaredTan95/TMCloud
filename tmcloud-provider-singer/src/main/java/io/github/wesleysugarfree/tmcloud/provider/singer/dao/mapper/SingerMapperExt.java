/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;

import java.util.List;

public interface SingerMapperExt {
    List<Singer> selectSelective(Singer singer);
}
