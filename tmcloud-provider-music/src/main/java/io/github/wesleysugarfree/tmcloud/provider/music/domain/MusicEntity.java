package io.github.wesleysugarfree.tmcloud.provider.music.domain;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Data
@Entity
@Table(name = "Song")
@SQLDelete(sql = "Update Song set Is_Deleted = 1 where Id = ?")
@Where(clause = "Is_Deleted = 0")
public class MusicEntity {
    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private Long singerId;

    @Column
    private String title;

    @Column
    private String url;

    @Column
    private int visitedTotal;

    @Column
    private int favNum;

    @Column
    private int downLoaded;

    @Column
    private String cover;

    @Column
    private String mvUrl;

    @Column
    private String description;

    @Column
    private int isDeleted;

    @Column
    private LocalDateTime updateTime;

    @Tolerate
    public MusicEntity() {
    }
}
