/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain.UserComment;

import java.util.List;

public interface UserCommentMapperExt {
    List<UserComment> selectSelective(UserComment record);
}