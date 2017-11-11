package io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer sSingerid);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer sSingerid);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);
}