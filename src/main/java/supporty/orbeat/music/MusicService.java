package supporty.orbeat.music;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.artist.repository.ArtistRepository;
import supporty.orbeat.music.dto.AmendMusicReq;
import supporty.orbeat.music.dto.AmendMusicRes;
import supporty.orbeat.music.dto.SaveMusicReq;
import supporty.orbeat.music.dto.SaveMusicRes;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.music.repository.MusicRepository;
import supporty.orbeat.user.dto.SignUpReq;
import supporty.orbeat.user.dto.SignUpRes;
import supporty.orbeat.user.entity.User;

import java.util.Objects;

import static supporty.orbeat.music.entity.Music.createMusic;

@Service
@Transactional
@RequiredArgsConstructor
public class MusicService {

    private final MusicRepository musicRepository;
    private final ArtistRepository artistRepository;

    @Transactional
    public SaveMusicRes saveMusic(SaveMusicReq saveMusicReq) {
        Artist artist = artistRepository.findById(saveMusicReq.getArtistId()).orElseThrow();
        Music musicReq = createMusic(saveMusicReq, artist);
        Music save = musicRepository.save(musicReq);
        SaveMusicRes res = new SaveMusicRes(save.getMusicId(), save.getMusicUrl(),
                save.getStatus(), save.getThumbnailUrl(), save.getTitle(),
                save.getVideoUrl(), save.getGenre(), save.getArtist().getIntroduction(), save.getCreatedAt());
        return res;
    }

    @Transactional
    public AmendMusicRes amendMusic(AmendMusicReq amendMusicReq) {
        Music music = musicRepository.findById(amendMusicReq.getMusicId()).orElseThrow();
        Artist artist = artistRepository.findById(amendMusicReq.getArtistId()).orElseThrow();
        music.setMusicUrl(amendMusicReq.getMusicUrl());
        music.setArtist(artist);
        music.setGenre(amendMusicReq.getGenre());
        music.setThumbnailUrl(amendMusicReq.getThumbnailUrl());
        music.setVideoUrl(amendMusicReq.getVideoUrl());
        AmendMusicRes res = new AmendMusicRes(music.getMusicId(), music.getMusicUrl(),
                music.getStatus(), music.getThumbnailUrl(), music.getTitle(),
                music.getVideoUrl(), music.getGenre(), music.getArtist().getIntroduction(), music.getCreatedAt());
        return res;
    }

}