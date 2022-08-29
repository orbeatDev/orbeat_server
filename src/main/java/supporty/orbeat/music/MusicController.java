package supporty.orbeat.music;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.common.exception.BaseException;
import supporty.orbeat.music.dto.AmendMusicReq;
import supporty.orbeat.music.dto.AmendMusicRes;
import supporty.orbeat.music.dto.SaveMusicReq;
import supporty.orbeat.music.dto.SaveMusicRes;
import supporty.orbeat.user.dto.SignUpReq;
import supporty.orbeat.user.dto.SignUpRes;
import supporty.orbeat.user.utils.ValidationExceptionProvider;

import javax.validation.Valid;


@Api(tags = {"Music"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class MusicController {

//    private final MusicService musicService;
//
//    @ApiOperation(value = "음악 저장", notes = "유저가 선택한 음악을 저장한다.")
//    @PostMapping("/save-music") @ResponseBody
//    public BaseResponse<SaveMusicRes> SaveMusic(@RequestBody @Valid SaveMusicReq saveMusicReq, Errors errors){
//        if(errors.hasErrors()) {
//            BaseException exception = ValidationExceptionProvider.throwValidError(errors);
//            return new BaseResponse<>(exception.getStatus());
//        }else{
//            SaveMusicRes savedMusic = musicService.saveMusic(saveMusicReq);
//            return new BaseResponse<>(savedMusic);
//        }
//    }
//
//    @ApiOperation(value = "음악 정보 수정", notes = "유저가 저장한 음악정보가 수정한다.")
//    @PatchMapping("/amend-music") @ResponseBody
//    public BaseResponse<AmendMusicRes> AmendMusic(@RequestBody @Valid AmendMusicReq amendMusicReq, Errors errors){
//        if(errors.hasErrors()) {
//            BaseException exception = ValidationExceptionProvider.throwValidError(errors);
//            return new BaseResponse<>(exception.getStatus());
//        }else{
//            AmendMusicRes amendedMusic = musicService.amendMusic(amendMusicReq);
//            return new BaseResponse<>(amendedMusic);
//        }
//    }
}
