package supporty.orbeat.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class SignUpReq {

    @NotBlank(message = "닉네임을 입력해주세요")
    @ApiModelProperty(value = "닉네임", required = true)
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-zA-Z0-9-_]{1,10}$",message = "닉네임은 특수 문자를 제외한 10자리 이내로 입력해주세요")
    private String nickname;


}
