package io.github.wesleysugarfree.tmcloud.provider.song.repository;

import io.github.wesleysugarfree.tmcloud.provider.song.entity.po.Song;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    List<Song> findByTitleContainingOrDescriptionContainingAndIsDeletedOrderByVisitedTotalDesc(String title, String description, Pageable page, int isDeleted);

    Song findById(long id);

    List<Song> findAllOrderByVisitedTotalDesc(Pageable pageable);

}
