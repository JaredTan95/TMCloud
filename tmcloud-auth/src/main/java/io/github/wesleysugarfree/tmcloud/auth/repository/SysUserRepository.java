package io.github.wesleysugarfree.tmcloud.auth.repository;

import io.github.wesleysugarfree.tmcloud.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByUsernameAndPassword(String name, String password);
}
