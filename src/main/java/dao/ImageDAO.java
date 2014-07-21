package dao;

import domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shopot on 20.07.14.
 */
public interface ImageDAO extends JpaRepository<Image,Long > {
    Image findByFileExtension(String fileExtension);
}
