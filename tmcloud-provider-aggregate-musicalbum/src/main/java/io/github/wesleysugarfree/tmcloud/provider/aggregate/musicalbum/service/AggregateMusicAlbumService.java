/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.service;

import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity.MusicAlbum;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.repository.MusicAlbumRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("aggregateMusicAlbumService")
public class AggregateMusicAlbumService {
    @Autowired
    private MusicAlbumRepository musicAlbumRepository;

    private static Logger logger = LoggerFactory.getLogger(AggregateMusicAlbumService.class);

    public BaseResult<MusicAlbum> getSongByAlbumId(int albumId) {
        BaseResult<MusicAlbum> baseResult = new BaseResult<>();
        baseResult.setContentLists(musicAlbumRepository.findAllByAlbumId(albumId));
        return baseResult;
    }

    public BaseResult<Long> getCount() {
        return new BaseResult<Long>().setContent(musicAlbumRepository.count());
    }
}
