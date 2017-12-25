package io.github.wesleysugarfree.tmcloud.provider.singer.dao.repository;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SingerRepository extends JpaRepository<Singer,Long> {


    List<Singer> findAllBySingerNameContainingOrderByVisitedTotalDesc(String name);
}
