package supporty.orbeat.musicselect;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.common.BaseResponseStatus;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.music.repository.MusicRepository;
import supporty.orbeat.musicselect.dto.BattleReq;
import supporty.orbeat.musicselect.dto.SaveBattleReq;
import supporty.orbeat.musicselect.entity.MusicSelect;
import supporty.orbeat.musicselect.repository.MusicSelectRepository;

@Slf4j
@Service
@AllArgsConstructor
public class MusicSelectService {

    MusicSelectRepository musicSelectRepository;
    MusicRepository musicRepository;

    public Music getMusicInfo(BattleReq battleReq, int index) {
        int roundInfo = battleReq.getRoundNumber();
        switch (roundInfo) {
            case 1:
                if(index==1) {
                    return musicRepository.findByMusicId(1L);
                } else if(index == 2) {
                    return musicRepository.findByMusicId(2L);
                }
                break;
            case 2:
                if(index==1) {
                    return musicRepository.findByMusicId(3L);
                } else if(index == 2) {
                    return musicRepository.findByMusicId(4L);
                }
                break;
            case 3:
                if(index==1) {
                    return musicRepository.findByMusicId(5L);
                } else if(index == 2) {
                    return musicRepository.findByMusicId(6L);
                }
                break;
            case 4:
                if(index==1) {
                    return musicRepository.findByMusicId(7L);
                } else if(index == 2) {
                    return musicRepository.findByMusicId(8L);
                }
                break;
            case 5:
                if(index==1) {
                    MusicSelect musicSelectInfo = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), 1);
                    return musicRepository.findByMusicId(musicSelectInfo.getMusicId());
                } else if (index==2) {
                    MusicSelect musicSelectInfo = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), 2);
                    return musicRepository.findByMusicId(musicSelectInfo.getMusicId());
                }
                break;
            case 6:
                if(index==1) {
                    MusicSelect musicSelectInfo = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), 3);
                    return musicRepository.findByMusicId(musicSelectInfo.getMusicId());
                } else if (index==2) {
                    MusicSelect musicSelectInfo = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), 4);
                    return musicRepository.findByMusicId(musicSelectInfo.getMusicId());
                }
                break;
            case 7:
                if(index==1) {
                    MusicSelect musicSelectInfo = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), 5);
                    return musicRepository.findByMusicId(musicSelectInfo.getMusicId());
                } else if (index==2) {
                    MusicSelect musicSelectInfo = musicSelectRepository.getByNicknameAndRound(battleReq.getNickname(), 6);
                    return musicRepository.findByMusicId(musicSelectInfo.getMusicId());
                }
                break;
            default:
                break;
        }
        return null;
    }

    public BaseResponse saveMusicSelectInfo(SaveBattleReq saveBattleReq) {
        MusicSelect musicSelect = new MusicSelect();
        try {
            musicSelect.setMusicId(saveBattleReq.getMusicId());
            musicSelect.setNickname(saveBattleReq.getNickname());
            musicSelect.setRound(saveBattleReq.getRoundNumber());
            musicSelectRepository.save(musicSelect);

            //final 선택된 음악 count + 1
            if(saveBattleReq.getRoundNumber() == 7) {
                musicRepository.increaseSelectedCount(saveBattleReq.getMusicId());
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new BaseResponse(BaseResponseStatus.INTERNAL_SERVER_ERROR);
        }
        return new BaseResponse(BaseResponseStatus.SUCCESS);
    }
}
