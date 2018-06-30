package io.github.jaredtan95.tmcloud.provider.music.repository;

import io.github.jaredtan95.tmcloud.provider.music.domain.MusicEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<MusicEntity, Long> {

    List<MusicEntity> findAllOrderByVisitedTotalDesc(Pageable pageable);

    List<MusicEntity> findByTitleContainingOrDescriptionContainingOrderByVisitedTotalDesc(String title, String description, Pageable pageable);
}
