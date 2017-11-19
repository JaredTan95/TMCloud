/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;

import java.util.List;

public interface TypeMapperExt {
    List<Type> selectSelective(Type record);
}