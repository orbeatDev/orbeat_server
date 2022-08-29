package supporty.orbeat.music.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.common.enumTypes.Status;
import supporty.orbeat.musicselect.entity.MusicSelect;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class SaveMusicRes {
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
