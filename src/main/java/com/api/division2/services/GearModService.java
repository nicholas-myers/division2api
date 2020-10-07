package com.api.division2.services;

import com.api.division2.models.GearMod;

import java.util.List;

public interface GearModService
{
   List<GearMod> findAllGearMods();
   GearMod save(GearMod gearMod);
}
