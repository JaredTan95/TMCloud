/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.service;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.SongTypeRepository;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapper;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapperExt;
import io.github.wesleysugarfree.tmcloud.provider.type.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("typeService")
public class TypeService {
    @Resource
    private TypeMapper typeMapper;

    @Resource
    private TypeMapperExt typeMapperExt;

    @Resource
    private SongTypeRepository songTypeRepository;

    private static Logger logger = LoggerFactory.getLogger(TypeService.class);


    public BaseResult<Type> addOne(Type type) {
        if (typeMapper.insertSelective(type) > 0) {
            logger.info("添加歌曲类型: {} 成功.", type.getsSttitle());
            return new BaseResult<>(true, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<Type> readOneById(int id) {
        return new BaseResult<>(true, typeMapper.selectByPrimaryKey(id), "200", "Readed successful.");
    }

    public BaseResult<Type> updateOne(Type type) throws Exception {
        try {
            if (typeMapper.updateByPrimaryKeySelective(type) > 0) {
                logger.info("歌曲类型「{},{}」更新成功. ", type.getsSttitle(), type.getUpdateTime());
                return new BaseResult<>(true, type, "200", "Updated successfully.");
            } else {
                return new BaseResult<>(false, type, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public BaseResult<Type> search(Type type) {
        return new BaseResult<>(true, typeMapperExt.selectSelective(type), "200", "Searched successfully.");
    }
}
