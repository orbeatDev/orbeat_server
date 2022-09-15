package supporty.orbeat.musicselect.controller;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.common.BaseResponseStatus;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.musicselect.MusicSelectService;
import supporty.orbeat.musicselect.dto.BattleReq;
import supporty.orbeat.musicselect.dto.SaveBattleReq;

import java.util.Arrays;

@RestController
@AllArgsConstructor
@RequestMapping("/api/battle")
public class MusicSelectController {

    private final MusicSelectService musicSelectService;

    @ApiOperation(value = "배틀 라운드 API", notes = "배틀을 진행한다.")
    @ResponseBody
    @PostMapping("/round/get")
    public BaseResponse getBattleInfo(@RequestBody BattleReq battleReq){
        Music firstMusic = musicSelectService.getMusicInfo(battleReq,1);
        Music secondMusic = musicSelectService.getMusicInfo(battleReq,2);
        if(firstMusic == null || secondMusic == null)  {
            return new BaseResponse(BaseResponseStatus.INTERNAL_SERVER_ERROR);
        }
        return new BaseResponse(Arrays.asList(firstMusic, secondMusic));
    }

    @ApiOperation(value = "배틀 라운드 저장 API", notes = "각 배틀 라운드 선택 정보를 저장한다")
    @ResponseBody
    @PostMapping("/round/save")
    public BaseResponse saveBattleInfo(@RequestBody SaveBattleReq saveBattleReq) {
        return musicSelectService.saveMusicSelectInfo(saveBattleReq);
    }
}
