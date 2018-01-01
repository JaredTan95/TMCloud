package io.github.wesleysugarfree.tmcloud.auth.domain.repository;

import io.github.wesleysugarfree.tmcloud.auth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
