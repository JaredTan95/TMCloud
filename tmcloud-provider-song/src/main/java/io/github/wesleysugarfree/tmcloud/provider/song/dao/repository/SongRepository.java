package io.github.wesleysugarfree.tmcloud.provider.song.dao.repository;

import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByTitleLikeAndDescriptionLike(String title,String descp);

    @Transactional
    int deleteById(long id);
}
