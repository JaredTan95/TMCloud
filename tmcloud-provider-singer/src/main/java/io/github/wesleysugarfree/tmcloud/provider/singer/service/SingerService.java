/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.service;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;
import io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper.SingerMapper;
import io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper.SingerMapperExt;
import io.github.wesleysugarfree.tmcloud.provider.singer.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("singerService")
public class SingerService {
    @Resource
    private SingerMapper singerMapper;

    @Resource
    private SingerMapperExt singerMapperExt;

    private static Logger logger = LoggerFactory.getLogger(SingerService.class);

    public BaseResult<Singer> addOne(Singer singer) {
        if (singerMapper.insertSelective(singer) > 0) {
            logger.info("添加歌手: {} 成功.", singer.getsSname());
            return new BaseResult<>(true, singer, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<Singer> readOneById(int id) {
        return new BaseResult<>(true, singerMapper.selectByPrimaryKey(id), "200", "Read successfully.");
    }

    public BaseResult<Singer> updateOne(Singer singer) throws Exception {
        try {
            if (singerMapper.updateByPrimaryKeySelective(singer) > 0) {
                logger.info("歌手「{}」更新成功. ", singer.getsSname());
                return new BaseResult<>(true, singer, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, singer, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public BaseResult<Singer> search(Singer singer) {
        logger.info("搜索歌手：{}", singer.getsSname());
        return new BaseResult<>(true, singerMapperExt.selectSelective(singer), "200", "Searched successfully.");
    }
}
