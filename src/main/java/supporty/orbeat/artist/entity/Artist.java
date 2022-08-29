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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistId;

    private String artistName;

    private String introduction;

    private String snsUrl;

    @Column(nullable = false)
    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
