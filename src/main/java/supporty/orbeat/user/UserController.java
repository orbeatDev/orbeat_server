package supporty.orbeat.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.common.exception.BaseException;
import supporty.orbeat.user.dto.SignUpReq;
import supporty.orbeat.user.dto.SignUpRes;
import supporty.orbeat.user.entity.User;
import supporty.orbeat.user.utils.ValidationExceptionProvider;

import javax.validation.Valid;

@Api(tags = {"User"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    @ApiOperation(value = "유저 생성", notes = "유저를 생성한다.")
    @PostMapping("/sign-up") @ResponseBody
    public BaseResponse<SignUpRes> SingUp(@RequestBody @Valid SignUpReq signUpReq, Errors errors){
        if(errors.hasErrors()) {
            BaseException exception = ValidationExceptionProvider.throwValidError(errors);
            return new BaseResponse<>(exception.getStatus());
        }else{
            SignUpRes signUpUser = userService.SignUp(signUpReq);
            return new BaseResponse<>(signUpUser);
        }
    }
}
