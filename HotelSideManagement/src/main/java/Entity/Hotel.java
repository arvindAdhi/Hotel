package Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="hotel",schema = "oyo")
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hotel_id;
    private String Hotel_name;
    private String description;

    public Hotel(long hotel_id, String hotel_name, String description) {
        this.hotel_id = hotel_id;
        this.Hotel_name = hotel_name;
        this.description = description;
    }

    public Hotel() {
    }

    public long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return Hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        Hotel_name = hotel_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
