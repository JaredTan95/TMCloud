/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain.UserComment;
import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain.UserCommentKey;

public interface UserCommentMapper {
    int deleteByPrimaryKey(UserCommentKey key);

    int insert(UserComment record);

    int insertSelective(UserComment record);

    UserComment selectByPrimaryKey(UserCommentKey key);

    int updateByPrimaryKeySelective(UserComment record);

    int updateByPrimaryKey(UserComment record);
}