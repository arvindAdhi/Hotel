package Mapper;

import DTO.HotelDTO;
import Entity.Hotel;

public class HotelMapper {

    public static HotelDTO toHotelDTO(Hotel hotel){
        HotelDTO hotelDTO = new HotelDTO();
        hotelDTO.setHotel_id(String.valueOf(hotel.getHotel_id()));
        hotelDTO.setHotel_name(hotel.getHotel_name());
        hotelDTO.setDescription(hotel.getDescription());
        return hotelDTO;
    }
    public static Hotel toHotelEntity(HotelDTO hotelDTO){
        Hotel hotel = new Hotel();
        hotel.setHotel_id(hotel.getHotel_id());
        hotel.setHotel_name(hotelDTO.getHotel_name());
        hotel.setDescription(hotelDTO.getDescription());
        return hotel;
    }
}
