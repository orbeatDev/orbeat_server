package supporty.orbeat.artist;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import supporty.orbeat.artist.dto.AmendArtistReq;
import supporty.orbeat.artist.dto.AmendArtistRes;
import supporty.orbeat.artist.dto.SignUpArtistReq;
import supporty.orbeat.artist.dto.SignupArtistRes;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.common.exception.BaseException;
import supporty.orbeat.user.utils.ValidationExceptionProvider;

import javax.validation.Valid;


@Api(tags = {"Artist"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class ArtistController {

//    private final ArtistService artistService;
//
//    @ApiOperation(value = "아티스트 생성", notes = "아티스트를 생성한다.")
//    @PostMapping("/sign-up-artist") @ResponseBody
//    public BaseResponse<SignupArtistRes> SingUpArtist(@RequestBody @Valid SignUpArtistReq signUpArtistReq, Errors errors){
//        if(errors.hasErrors()) {
//            BaseException exception = ValidationExceptionProvider.throwValidError(errors);
//            return new BaseResponse<>(exception.getStatus());
//        }else{
//            SignupArtistRes signUpArtist = artistService.signUpArtist(signUpArtistReq);
//            return new BaseResponse<>(signUpArtist);
//        }
//    }
//
//    @ApiOperation(value = "아티스트 정보 수정", notes = "아티스트 정보를 수정한다.")
//    @PatchMapping("/amend-artist") @ResponseBody
//    public BaseResponse<AmendArtistRes> AmendArtist(@RequestBody @Valid AmendArtistReq amendArtistReq, Errors errors){
//        if(errors.hasErrors()) {
//            BaseException exception = ValidationExceptionProvider.throwValidError(errors);
//            return new BaseResponse<>(exception.getStatus());
//        }else{
//            AmendArtistRes amendedArtist = artistService.amendArtist(amendArtistReq);
//            return new BaseResponse<>(amendedArtist);
//        }
//    }
}
