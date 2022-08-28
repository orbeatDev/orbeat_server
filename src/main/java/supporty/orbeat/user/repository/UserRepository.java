package supporty.orbeat.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supporty.orbeat.user.entity.User;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Long> {
    Optional<User> findByNickname(String nickname);
}
