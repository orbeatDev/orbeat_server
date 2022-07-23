package supporty.orbeat.music.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.common.enumTypes.Status;
import supporty.orbeat.musicselect.entity.MusicSelect;
import supporty.orbeat.user.entity.BaseTimeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"musicId","musicUrl","thumbnailUrl","title","videoUrl","selectedCount","genre"})
@Table(name = "music")
public class Music extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicId;

    @Column(nullable = false)
    private String musicUrl;

    @Column(nullable = false)
    private Status status;

    private String thumbnailUrl;

    @Column(nullable = false)
    private String title;

    private String videoUrl;

    @Column(nullable = false)
    private Long selectedCount;

    @Column(nullable = false)
    private String genre;

    @JsonManagedReference
    @OneToMany(mappedBy = "music")
    private List<MusicSelect> musicSelects = new ArrayList<>();

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artistId")
    private Artist artist;

}
