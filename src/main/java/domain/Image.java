package domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by shopot on 06.07.14.
 */
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(columnDefinition = "LONGBLOB")
    private byte[] data;
    private String fileNameWithExtention;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getFileNameWithExtention() {
        return fileNameWithExtention;
    }

    public void setFileNameWithExtention(String fileNameWithExtention) {
        this.fileNameWithExtention = fileNameWithExtention;
    }

}
