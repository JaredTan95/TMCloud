package io.github.wesleysugarfree.tmcloud.auth.repository;

import io.github.wesleysugarfree.tmcloud.auth.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByPhone(String phone);

    List<User> findAllByOrderByIdAsc(Pageable pageRequest);
}
