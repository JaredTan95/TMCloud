package io.github.wesleysugarfree.tmcloud.provider.type.dao.repository;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {
}
