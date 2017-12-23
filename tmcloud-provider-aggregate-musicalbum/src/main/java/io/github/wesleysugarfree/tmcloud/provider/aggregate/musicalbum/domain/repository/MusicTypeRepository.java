/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.repository;

import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity.MusicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicTypeRepository extends JpaRepository<MusicType,Integer>{

}
