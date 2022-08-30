package supporty.orbeat.musicselect.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SaveBattleReq {
    private String nickname;
    @JsonProperty("music_id")
    private Long musicId;
    @JsonProperty("round_number")
    private int roundNumber;
}
