package supporty.orbeat.artist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import supporty.orbeat.common.enumTypes.Status;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class SignupArtistRes {
    private Long artistId;
    private Status status;
    private String introduction;
    private String sns;
    private String artistName;
    private String youtubeAddress;
    private LocalDateTime createdAt;
}
