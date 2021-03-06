package io.github.jaredtan95.tmcloud.auth.domain.repository;

import io.github.jaredtan95.tmcloud.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends JpaRepository<User, Long> {
    User findById(Long id);

    User findByUsername(String username);

    User findByUsernameAndPassword(String name, String password);
}
