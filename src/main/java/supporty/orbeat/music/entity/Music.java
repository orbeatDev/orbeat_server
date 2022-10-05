package supporty.orbeat.music.entity;

import lombok.*;
import supporty.orbeat.user.entity.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "music")
public class Music extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicId;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String musicUrl;

    @Column(nullable = false)
    private String artistName;

    @Column(nullable = false)
    private Long selectedCount;

    @Column(nullable = false)
    private String status;

    private String thumbnailUrl;

    @Column(nullable = false)
    private String title;

    private String videoUrl;

    private Long artistId;
}
