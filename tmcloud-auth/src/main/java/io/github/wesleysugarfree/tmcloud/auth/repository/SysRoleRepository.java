package io.github.wesleysugarfree.tmcloud.auth.repository;

import io.github.wesleysugarfree.tmcloud.auth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SysRoleRepository extends JpaRepository<Role, Long> {

}
