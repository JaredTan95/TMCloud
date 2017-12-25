package io.github.wesleysugarfree.tmcloud.provider.song.dao.repository;

import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    /**
     * 查询歌曲标题或歌曲描述中包含搜索字且处于上架状态的歌曲列表，并按照访问量倒序排序。
     * @param isdelt，是否删除（上架或下架状态）
     * @param title
     * @param descp
     * @return
     */
    List<Song> findAllByIsDeletedIsAndTitleContainingOrDescriptionContainingOrderByVisitedTotalDesc(int isdelt,String title,String descp);

    @Transactional
    int deleteById(long id);
}
