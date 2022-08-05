package supporty.orbeat.artist.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import supporty.orbeat.artist.ArtistController;
import supporty.orbeat.artist.dto.SignUpArtistReq;
import supporty.orbeat.common.enumTypes.Status;
import supporty.orbeat.music.dto.SaveMusicReq;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.user.entity.BaseTimeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"artistId","sns","introduction"})
@Table(name = "artist")
public class Artist extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @JsonManagedReference
    @OneToMany(mappedBy = "artist")
    private List<Music> musicList = new ArrayList<>();

    @Column(nullable = false)
    private String artistName;

    private String sns;

    private String introduction;

    private String youtubeAddress;

    public static Artist createArtist(SignUpArtistReq signUpArtistReq) {
        return Artist.builder()
                .status(Status.Y)
                .sns(signUpArtistReq.getSns())
                .artistName(signUpArtistReq.getArtistName())
                .introduction(signUpArtistReq.getIntroduction())
                .youtubeAddress(signUpArtistReq.getYoutubeAddress())
                .build();
    }
}
