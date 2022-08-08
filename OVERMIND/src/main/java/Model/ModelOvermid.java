package Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data
@EqualsAndHashCode
@ToString
public class ModelOvermid {

    @Id
    @GeneratedValue()
    private Long id;
private Integer Rank;
private String Title;
private Float IMDb;




}
