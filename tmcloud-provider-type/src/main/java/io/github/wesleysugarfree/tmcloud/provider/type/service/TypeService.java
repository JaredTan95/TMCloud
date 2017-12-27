/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.service;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.repository.TypeRepository;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service("typeService")
public class TypeService {
    @Resource
    private TypeRepository repository;

    private static Logger logger = LoggerFactory.getLogger(TypeService.class);

    public BaseResult<Type> addOne(Type type) {
        Type type1 = repository.save(type);
        if (Objects.nonNull(type1)) {
            logger.info("添加歌曲类型: {} 成功.", type.getTitle());
            return new BaseResult<>(true, type1, "200", "Added successful.");
        }
        return new BaseResult<>(true, "500", "Added failure.");
    }

    public BaseResult<Type> readOneById(Long id) {
        return new BaseResult<>(true, repository.findOne(id), "200", "Readed successful.");
    }

    public BaseResult<Type> updateOne(Type type) throws Exception {
        try {
            Type typeOld = repository.findOne(type.getId());
            type.setId(typeOld.getId());
            type.setTitle(typeOld.getTitle());
            if (Objects.nonNull(repository.save(type))) {
                logger.info("歌曲类型「{},{}」更新成功. ", type.getTitle(), type.getUpdateTime());
                return new BaseResult<>(true, type, "200", "Updated successfully.");
            } else {
                logger.info("歌曲类型「{},{}」更新失败. ", type.getTitle(), type.getUpdateTime());
                return new BaseResult<>(true, type, "500", "Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 根据类型搜索音乐列表
     * @param q，音乐类型
     * @return
     */
    public BaseResult<Type> search(String q) {
        return null;
        // return new BaseResult<>(true, typeMapperExt.selectSelective(type), "200", "Searched successfully.");
    }
}
