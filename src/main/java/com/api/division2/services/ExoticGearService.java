package com.api.division2.services;

import com.api.division2.models.ExoticGear;

import java.util.List;

public interface ExoticGearService
{
   List<ExoticGear> findAllExoticGear();
   ExoticGear save(ExoticGear exoticGear);
}
