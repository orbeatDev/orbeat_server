package supporty.orbeat.musicselect.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BattleReq {

    private String nickname;
    @JsonProperty("round_number")
    private int roundNumber;
}
