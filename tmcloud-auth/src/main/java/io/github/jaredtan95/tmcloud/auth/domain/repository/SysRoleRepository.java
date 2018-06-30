package io.github.jaredtan95.tmcloud.auth.domain.repository;

import io.github.jaredtan95.tmcloud.auth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
