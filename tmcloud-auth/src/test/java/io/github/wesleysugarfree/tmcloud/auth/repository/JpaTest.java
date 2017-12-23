package io.github.wesleysugarfree.tmcloud.auth.repository;

import io.github.wesleysugarfree.tmcloud.auth.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpaTest.class)
public class JpaTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void findAllUser(){
        List<User> lists=userRepository.findAll();
        for(User item:lists){
            System.out.println(item.getNickName()+" "+item.getPhone());
        }
    }
}
