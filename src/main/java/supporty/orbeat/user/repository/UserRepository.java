package supporty.orbeat.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import supporty.orbeat.user.entity.User;

public interface UserRepository  extends JpaRepository<User,Long> {

}
