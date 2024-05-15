package Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name="hotel",schema = "oyo")
@Data
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hotel_id;
    private String Hotel_name;
    private String description;

}
