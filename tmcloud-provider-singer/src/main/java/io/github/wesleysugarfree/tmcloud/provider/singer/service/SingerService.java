/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.service;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;
import io.github.wesleysugarfree.tmcloud.provider.singer.dao.repository.SingerRepository;
import io.github.wesleysugarfree.tmcloud.provider.singer.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service("singerService")
public class SingerService {
    @Resource
    private SingerRepository repository;

    private static Logger logger = LoggerFactory.getLogger(SingerService.class);

    public BaseResult<Singer> addOne(Singer singer) {
        if (Objects.nonNull(repository.save(singer))) {
            logger.info("添加歌手: {} 成功.", singer.getSingerName());
            return new BaseResult<>(true, singer, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<Singer> readOneById(long id) {
        return new BaseResult<>(true, repository.findOne(id), "200", "Read successfully.");
    }

    public BaseResult<Singer> updateOne(Singer singer) throws Exception {

        try {
            //TODO:优化，下面逻辑删除也需要优化。
            Singer singerOld = repository.findOne(singer.getId());

            singer.setId(singerOld.getId());
            singer.setSingerName(singerOld.getSingerName());
            singer.setGender(singerOld.getGender());
            singer.setDescription(singerOld.getDescription());
            singer.setVisitedTotal(singerOld.getVisitedTotal());
            singer.setPicture(singerOld.getPicture());
            //song.setUpdateTime(); 更新时间采取数据库本地时间

            if (Objects.nonNull(repository.save(singer))) {
                logger.info("歌手「{}」更新成功. ", singer.getSingerName());
                return new BaseResult<>(true, singer, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, singer, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public BaseResult<Singer> search(String name) {
        logger.info("搜索歌手：{}", name);
        return new BaseResult<>(true, repository.findAllBySingerNameContainingOrderByVisitedTotalDesc(name),
                "200", "Searched successfully.");
    }
}
