/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.user.dao.domain.User;

import java.util.List;

public interface UserMapperExt {
    List<User> selectSelective(User record);
}