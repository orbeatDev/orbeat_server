package supporty.orbeat.musicselect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.musicselect.entity.MusicSelect;

@Repository
public interface MusicSelectRepository extends JpaRepository<MusicSelect, Long> {
    public MusicSelect getByNicknameAndRound(String nickname, int round);
}
