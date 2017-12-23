/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.service;


import io.github.wesleysugarfree.tmcloud.provider.type.dao.SongTypeRepository;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapper;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapperExt;
import io.github.wesleysugarfree.tmcloud.provider.type.entity.SongType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeServiceTest {
    @Autowired
    private TypeService typeService;

    @Resource
    private TypeMapper typeMapper;

    @Resource
    private TypeMapperExt typeMapperExt;

    @Resource
    private SongTypeRepository songTypeRepository;

    @Test
    public void searchServiceTest() throws Exception {
        Type type = new Type();
        type.setsSttitle("test");
        Assert.assertEquals(1, typeService.search(type).getContentLists().size());
    }

    @Test
    public void addOneByJpaTest() {
        SongType songType = new SongType();
        songType.setId(1000);
        songType.setTitile("test title");
        Assert.assertNotNull(songTypeRepository.save(songType));
    }

    @Test
    public void findAllByJpaTest(){
        List<SongType> lists=songTypeRepository.findAll();
        for(SongType item:lists){
            System.out.println(item.getTitile());
        }
    }
}
