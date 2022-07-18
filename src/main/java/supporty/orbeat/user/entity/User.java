package supporty.orbeat.user.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.musicselect.entity.MusicSelect;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"userId","userName"})
@Table(name = "user")
public class User extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String userName;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<MusicSelect> musicSelects = new ArrayList<>();

}
