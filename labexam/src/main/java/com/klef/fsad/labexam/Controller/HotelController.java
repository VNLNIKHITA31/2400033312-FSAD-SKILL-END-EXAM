package com.klef.fsad.labexam.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.labexam.Entity.HotelEntity;
import com.klef.fsad.labexam.Service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController 
{
    @Autowired
    private HotelService hotelService;

    // Add hotel
    @PostMapping("/add")
    public HotelEntity addHotel(@RequestBody HotelEntity hotel)
    {
        return hotelService.addHotel(hotel);
    }

    // Get all hotels
    @GetMapping("/all")
    public List<HotelEntity> getAllHotels()
    {
        return hotelService.getAllHotels();
    }
}