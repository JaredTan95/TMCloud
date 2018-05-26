/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.service;

import io.github.wesleysugarfree.tmcloud.provider.type.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.repository.TypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service("typeService")
public class TypeService {
    private TypeRepository repository;

    public TypeService(TypeRepository repository) {
        this.repository = repository;
    }

    private static Logger logger = LoggerFactory.getLogger(TypeService.class);

    public Type addOne(Type type) {
        return repository.save(type);
    }

    public Type readOneById(Long id) {
        return repository.findOne(id);
    }

    public Type updateOne(Type type) throws Exception {
        try {
            Type typeOld = repository.findOne(type.getId());
            type.setId(typeOld.getId());
            type.setTitle(typeOld.getTitle());
            if (Objects.nonNull(repository.save(type))) {
                logger.info("歌曲类型「{},{}」更新成功. ", type.getTitle(), type.getUpdateTime());
                return type;
            } else {
                logger.info("歌曲类型「{},{}」更新失败. ", type.getTitle(), type.getUpdateTime());
                return type;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 根据类型搜索音乐列表
     *
     * @param q，音乐类型
     * @return
     */
    public Type search(String q) {
        return null;
        // return new BaseResult<>(true, typeMapperExt.selectSelective(type), "200", "Searched successfully.");
    }
}
