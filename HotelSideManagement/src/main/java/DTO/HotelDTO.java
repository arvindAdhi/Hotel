package DTO;

import lombok.*;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HotelDTO {
    private String hotel_id;
    private String Hotel_name;
    private String description;

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
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
