package supporty.orbeat.musicselect.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "music_select")
public class MusicSelect implements Serializable {

    @Id
    private Long musicSelectId;
    private String nickname;
    private Long musicId;
    private int round;
}
