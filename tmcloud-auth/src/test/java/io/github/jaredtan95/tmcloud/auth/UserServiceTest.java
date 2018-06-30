package io.github.jaredtan95.tmcloud.auth;

import io.github.jaredtan95.tmcloud.auth.domain.Role;
import io.github.jaredtan95.tmcloud.auth.domain.User;
import io.github.jaredtan95.tmcloud.auth.domain.enumtype.Authority;
import io.github.jaredtan95.tmcloud.auth.domain.repository.SysRoleRepository;
import io.github.jaredtan95.tmcloud.auth.domain.repository.SysUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UserServiceTest.class, AuthApplication.class})
public class UserServiceTest {
    @Resource
    private SysRoleRepository sysRoleRepository;

    @Resource
    private SysUserRepository sysUserRepository;

    @Test
    public void save() {
        User user = new User();
        user.setId(100l);
        user.setUsername("test Save");
        user.setPassword("test");
        List<Role> roleList = new ArrayList<>();
        roleList.add(sysRoleRepository.findByName(Authority.ROLE_USER.toString()));
        user.setRoles(roleList);

        User savedUser = sysUserRepository.save(user);
        System.out.println(savedUser.getPassword() + "" + savedUser.getAuthorities() + "" + savedUser.getRoles());
    }
}
