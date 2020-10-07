package com.api.division2.services;

import com.api.division2.models.GearAttribute;

import java.util.List;

public interface GearAttributeService
{
   List<GearAttribute> findAllGearAttributes();
   GearAttribute save(GearAttribute gearAttribute);
}
