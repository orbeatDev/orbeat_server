package supporty.orbeat.artist;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import supporty.orbeat.artist.dto.AmendArtistReq;
import supporty.orbeat.artist.dto.AmendArtistRes;
import supporty.orbeat.artist.dto.SignUpArtistReq;
import supporty.orbeat.artist.dto.SignupArtistRes;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.artist.repository.ArtistRepository;


@Service
@Transactional
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository artistRepository;

//    @Transactional
//    public SignupArtistRes signUpArtist(SignUpArtistReq signUpArtistReq){
//        Artist artistReq=createArtist(signUpArtistReq);
//        Artist save = artistRepository.save(artistReq);
//        SignupArtistRes res=new SignupArtistRes(save.getArtistId(),save.getStatus(),save.getIntroduction(),
//                save.getSns(), save.getArtistName(), save.getYoutubeAddress(), save.getCreatedAt());
//        return res;
//    }
//
//    @Transactional
//    public AmendArtistRes amendArtist(AmendArtistReq amendArtistReq){
//        Artist artist = artistRepository.findById(amendArtistReq.getArtistId()).orElseThrow();
//        artist.setArtistName(amendArtistReq.getArtistName());
//        artist.setIntroduction(amendArtistReq.getIntroduction());
//        artist.setSns(amendArtistReq.getSns());
//        artist.setYoutubeAddress(amendArtistReq.getYoutubeAddress());
//        AmendArtistRes res = new AmendArtistRes(artist.getArtistId(), artist.getStatus(), artist.getIntroduction(),
//                artist.getSns(), artist.getArtistName(), artist.getYoutubeAddress(), artist.getUpdatedAt());
//        return res;
//    }


}
