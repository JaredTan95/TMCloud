/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.service;


import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapper;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeServiceTest {
    @Autowired
    private TypeService typeService;

    @Resource
    private TypeMapper typeMapper;

    @Resource
    private TypeMapperExt typeMapperExt;

    @Test
    public void searchServiceTest() throws Exception {
        Type type=new Type();
        type.setsSttitle("test");
        Assert.assertEquals(1,typeService.search(type).getContentLists().size());
    }
}
