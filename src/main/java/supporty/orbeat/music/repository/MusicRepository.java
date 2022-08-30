package supporty.orbeat.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import supporty.orbeat.music.entity.Music;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music,Long> {
    Music findByMusicId(Long musicId);

    @Transactional
    @Modifying
    @Query(value = "update music set selected_count = selected_count + 1 where music_id = :music_id", nativeQuery = true)
    void increaseSelectedCount(@Param(value = "music_id") Long musicId);

    @Query(value = "select * from music order by selected_count desc limit 5", nativeQuery = true)
    List<Music> findTop5MusicList();
}
