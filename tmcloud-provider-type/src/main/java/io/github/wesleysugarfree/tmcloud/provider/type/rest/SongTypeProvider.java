/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.rest;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.type.service.TypeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/types")
public class SongTypeProvider {
    @Resource
    private TypeService typeService;

    /**
     * 通过歌曲类型ID获取歌曲类型信息
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<Type> get(@PathVariable int id) throws Exception {
        return typeService.readOneById(id);
    }

    /**
     * 新增一首歌曲类型
     *
     * @param type
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult<Type> post(Type type) throws Exception {
        return typeService.addOne(type);
    }

    /**
     * 更新一首歌曲类型信息
     *
     * @param type
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    public BaseResult<Type> put(Type type) throws Exception {
        return typeService.updateOne(type);
    }

    /**
     * 通过组合条件搜索歌曲类型列表
     *
     * @param type
     * @return ListResult
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<Type> gettypes(Type type) throws Exception {
        return typeService.search(type);
    }

    /**
     * 删除一首歌曲类型信息，原则上只能修改歌曲类型上下架状态
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<Type> delete(@PathVariable int id) throws Exception {
        return null;
    }
}
