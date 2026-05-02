package com.klef.fsad.labexam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klef.fsad.labexam.Entity.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Integer>
{
}