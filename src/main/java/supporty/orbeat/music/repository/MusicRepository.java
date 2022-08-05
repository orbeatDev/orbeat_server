package supporty.orbeat.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supporty.orbeat.music.entity.Music;
import supporty.orbeat.user.entity.User;

public interface MusicRepository extends JpaRepository<Music,Long> {
    
}
