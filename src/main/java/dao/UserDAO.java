package dao;

import domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shopot on 06.07.14.
 */
public interface UserDAO extends JpaRepository<User,Long> {
}
