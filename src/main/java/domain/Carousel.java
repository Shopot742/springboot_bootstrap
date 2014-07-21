package domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by shopot on 06.07.14.
 */
@Entity
@Table(name = "carousel")
public class Carousel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @OneToOne
    private Image img;
    @NotNull
    private String title;

    public Carousel() {
    }

    public Carousel(Image img, String title) {
        this.img = img;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
