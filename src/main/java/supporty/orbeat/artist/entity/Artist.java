package supporty.orbeat.artist.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import supporty.orbeat.artist.entity.enumTypes.Status;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.musicselect.entity.MusicSelect;
import supporty.orbeat.user.entity.BaseTimeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
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

    private String sns;

    private String introduction;

}
