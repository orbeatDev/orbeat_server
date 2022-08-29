package supporty.orbeat.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import supporty.orbeat.music.entity.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music,Long> {
    public Music findByMusicId(Long musicId);
}
