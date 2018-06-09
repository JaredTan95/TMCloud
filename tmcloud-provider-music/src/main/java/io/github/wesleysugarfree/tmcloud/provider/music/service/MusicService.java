/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.music.service;

import io.github.wesleysugarfree.tmcloud.provider.music.domain.MusicEntity;
import io.github.wesleysugarfree.tmcloud.provider.music.domain.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.music.repository.MusicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Objects;

@Slf4j
@Service("songService")
public class MusicService {
    private MusicRepository repository;

    public MusicService(MusicRepository repository) {
        this.repository = repository;
    }

    public BaseResult<MusicEntity> addOne(MusicEntity music) {
        if (Objects.nonNull(repository.save(music))) {
            log.info("添加歌曲: {} 成功.", music.getTitle());
            return new BaseResult<>(true, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<MusicEntity> readOneById(long id) {
        return new BaseResult<>(true, repository.findOne(id), "200", "Read successful.");
    }

    public BaseResult<MusicEntity> readTopByVisited(Pageable pageable) {
        return new BaseResult<>(true, repository.findAllOrderByVisitedTotalDesc(pageable),
                "200", "Read successful.");
    }

    public BaseResult<MusicEntity> updateOne(MusicEntity music) throws Exception {
        try {
            MusicEntity musicEntity = repository.findOne(music.getId());
            musicEntity.setCover(music.getCover());
            musicEntity.setDescription(music.getDescription());
            musicEntity.setMvUrl(music.getMvUrl());
            musicEntity.setSingerId(music.getSingerId());
            musicEntity.setTitle(music.getTitle());
            musicEntity.setUrl(music.getUrl());

            if (Objects.nonNull(repository.save(musicEntity))) {
                log.info("歌曲「{},{}」更新成功. ", musicEntity.getId(), musicEntity.getTitle());
                return new BaseResult<>(true, musicEntity, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, musicEntity, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public BaseResult<MusicEntity> search(String title, String description, Pageable pageable) {
        return new BaseResult<>(true, repository
                .findByTitleContainingOrDescriptionContainingOrderByVisitedTotalDesc(title, description, pageable),
                "200", "Searched successfully.");
    }

    public BaseResult<Object> deleteOne(long id) {
        MusicEntity musicEntity = repository.findOne(id);
        Assert.isNull(musicEntity, "can't delete: Illegal args.");
        repository.delete(id);
        return new BaseResult<>(true, musicEntity, "200", "Logical Deleted successfully.");
    }
}
