package io.github.wesleysugarfree.tmcloud.auth.repository;

import io.github.wesleysugarfree.tmcloud.auth.entity.Role;
import io.github.wesleysugarfree.tmcloud.auth.enumtype.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    List<Role> findByRole(Authority auth);
}
