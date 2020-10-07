package com.api.division2.services;

import com.api.division2.models.GearTalent;

import java.util.List;

public interface GearTalentService
{
   List<GearTalent> findAllGearTalents();
   GearTalent save(GearTalent gearTalent);
}
