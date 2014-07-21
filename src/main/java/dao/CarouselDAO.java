package dao;

import domain.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shopot on 20.07.14.
 */
public interface CarouselDAO extends JpaRepository<Carousel, Long> {
}
