package supporty.orbeat.music.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import supporty.orbeat.common.enumTypes.Status;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AmendMusicRes {
    private Long musicId;
    private String musicUrl;
    private Status status;
    private String thumbnailUrl;
    private String title;
    private String videoUrl;
    private String genre;
    private String artistName;
    private LocalDateTime createdAt;
}
