package supporty.orbeat.artist.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SignUpArtistReq {
    @ApiModelProperty(value = "sns 정보")
    private String sns;

    @ApiModelProperty(value = "한줄 소개")
    private String introduction;

    @NotBlank(message = "아티스트 이름을 입력해주세요")
    @ApiModelProperty(value = "아티스트 이름", required = true)
    private String artistName;

    @ApiModelProperty(value = "유튜브 주소")
    private String youtubeAddress;
}
