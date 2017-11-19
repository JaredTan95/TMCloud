package io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer sStid);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer sStid);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}