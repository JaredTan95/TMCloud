package io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;

public interface SongMapper {
    int deleteByPrimaryKey(Integer sSongid);

    int insert(Song record);

    int insertSelective(Song record);

    Song selectByPrimaryKey(Integer sSongid);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKey(Song record);
}