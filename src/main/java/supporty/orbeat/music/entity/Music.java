package supporty.orbeat.music.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.artist.repository.ArtistRepository;
import supporty.orbeat.common.enumTypes.Status;
import supporty.orbeat.music.dto.SaveMusicReq;
import supporty.orbeat.musicselect.entity.MusicSelect;
import supporty.orbeat.user.dto.SignUpReq;
import supporty.orbeat.user.entity.BaseTimeEntity;
import supporty.orbeat.user.entity.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"musicId", "musicUrl", "thumbnailUrl", "title", "videoUrl", "selectedCount", "genre"})
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

    public static Music createMusic(SaveMusicReq saveMusicReq, Artist artist) {
        return Music.builder()
                .musicUrl(saveMusicReq.getMusicUrl())
                .status(Status.Y)
                .thumbnailUrl(saveMusicReq.getThumbnailUrl())
                .title(saveMusicReq.getTitle())
                .videoUrl(saveMusicReq.getVideoUrl())
                .genre(saveMusicReq.getGenre())
                .artist(artist)
                .build();
    }
}
