package io.github.wesleysugarfree.tmcloud.provider.type.repository;

import io.github.wesleysugarfree.tmcloud.provider.type.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {
}
