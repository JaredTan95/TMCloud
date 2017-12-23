/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.repository;

import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity.MusicAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MusicAlbumRepository extends JpaRepository<MusicAlbum, Integer> {
    //TODO:问题！！！
    List<MusicAlbum> findAllByAlbumId(int albumId);

    List<MusicAlbum> findAllBySongId(int songId);

    List<MusicAlbum> findAllByUpdateTime(Date date);
}
