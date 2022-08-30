package supporty.orbeat;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.artist.repository.ArtistRepository;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.music.repository.MusicRepository;
import supporty.orbeat.musicselect.dto.BattleReq;
import supporty.orbeat.musicselect.entity.MusicSelect;
import supporty.orbeat.musicselect.repository.MusicSelectRepository;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/result")
public class ResultController {

    private final MusicRepository musicRepository;
    private final MusicSelectRepository musicSelectRepository;
    private final ArtistRepository artistRepository;

    @ApiOperation(value = "최종 결과 조회 API", notes = "최종 결과를 가져온다")
    @PostMapping("/get")
    @ResponseBody
    public BaseResponse getFinalResult(@RequestBody BattleReq battleReq) {
        MusicSelect musicSelect = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), battleReq.getRoundNumber());
        Music music = musicRepository.findByMusicId(musicSelect.getMusicId());
        Artist artist = artistRepository.findByArtistId(music.getArtistId());
        List<Music> musicListInOrder = musicRepository.findTop5MusicList();
        return new BaseResponse(Arrays.asList(battleReq.getNickname(), music, artist, musicListInOrder));
    }
}
