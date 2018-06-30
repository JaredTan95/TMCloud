package io.github.jaredtan95.tmcloud.auth.service;

import io.github.jaredtan95.tmcloud.auth.domain.Role;
import io.github.jaredtan95.tmcloud.auth.domain.User;
import io.github.jaredtan95.tmcloud.auth.domain.enumtype.Authority;
import io.github.jaredtan95.tmcloud.auth.domain.repository.SysRoleRepository;
import io.github.jaredtan95.tmcloud.auth.domain.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class UserService implements UserDetailsService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = sysUserRepository.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }

    /**
     * 根据用户名和密码验证此用户是否存在
     *
     * @param user
     * @return
     */
    public boolean validate(User user) {
        User entity = sysUserRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (Objects.nonNull(entity)) {
            return true;
        }
        return false;
    }

    /**
     * 保存用户，并传入用户角色
     *
     * @param user
     * @param auth
     * @return
     */
    public User registry(User user, Authority auth) {
        User u = sysUserRepository.findByUsername(user.getUsername());
        if (Objects.nonNull(u)) {
            //加密密码
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            List<Role> roleList = new ArrayList<>();
            roleList.add(sysRoleRepository.findByName(auth.name()));
            user.setRoles(roleList);
            return sysUserRepository.save(user);
        } else {
            return user;
        }
    }


    /**
     * 删除用户，注意：此处为物理删除
     *
     * @param id
     * @return
     */
    public boolean delete(Long id) {
        sysUserRepository.delete(id);
        return true;
    }


    /**
     * 编辑用户信息
     *
     * @param user
     * @return
     */
    public boolean edit(User user) {
        sysUserRepository.save(user);
        return true;
    }

    /**
     * 根据用户名判断该用户是否已存在
     *
     * @param user
     * @return
     */
    public boolean exits(User user) {
        User entity = sysUserRepository.findByUsername(user.getUsername());
        if (Objects.nonNull(entity)) {
            return true;
        }
        return false;
    }
}
