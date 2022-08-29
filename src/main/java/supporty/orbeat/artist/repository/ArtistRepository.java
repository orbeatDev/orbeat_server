package supporty.orbeat.artist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supporty.orbeat.artist.entity.Artist;
import supporty.orbeat.user.entity.User;

public interface ArtistRepository extends JpaRepository<Artist,Long> {

}