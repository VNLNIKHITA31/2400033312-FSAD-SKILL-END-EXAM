package com.klef.fsad.labexam.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.labexam.Entity.HotelEntity;
import com.klef.fsad.labexam.Repository.HotelRepository;

@Service
public class HotelService 
{
    @Autowired
    private HotelRepository hotelRepository;

    // Add hotel
    public HotelEntity addHotel(HotelEntity hotel)
    {
        return hotelRepository.save(hotel);
    }

    // Get all hotels
    public List<HotelEntity> getAllHotels()
    {
        return hotelRepository.findAll();
    }
}