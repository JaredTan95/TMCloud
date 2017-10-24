package io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.user.dao.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer sUserid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer sUserid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}