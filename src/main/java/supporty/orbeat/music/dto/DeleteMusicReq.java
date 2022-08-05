package supporty.orbeat.music.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DeleteMusicReq {

    @NotBlank(message = "음악 경로를 입력해주세요")
    @ApiModelProperty(value = "음악 경로", required = true)
    private String musicUrl;

    @NotBlank(message = "음악 이미지 경로를 입력해주세요")
    @ApiModelProperty(value = "음악 이미지 경로", required = true)
    private String thumbnailUrl;

    @NotBlank(message = "노래명을 입력해주세요")
    @ApiModelProperty(value = "노래명", required = true)
    private String title;

    @NotBlank(message = "아티스트 고유번호를 입력해주세요")
    @ApiModelProperty(value = "아티스트 고유번호", required = true)
    private Long artistId;

    @ApiModelProperty(value = "음악 경로")
    private String videoUrl;

    @NotBlank(message = "장르를 입력해주세요")
    @ApiModelProperty(value = "장르", required = true)
    private String genre;
}
