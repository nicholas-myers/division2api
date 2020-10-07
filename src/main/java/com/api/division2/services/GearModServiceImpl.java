package com.api.division2.services;

import com.api.division2.models.GearMod;
import com.api.division2.repositories.GearModRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "gearModService")
public class GearModServiceImpl implements GearModService
{
   @Autowired
   private GearModRepository gearmodrepos;

   @Override
   public List<GearMod> findAllGearMods()
   {
      List<GearMod> allGearMods = new ArrayList<>();
      gearmodrepos.findAll().iterator().forEachRemaining(allGearMods::add);
      return allGearMods;
   }

   @Transactional
   @Override
   public GearMod save(GearMod gearMod)
   {
      GearMod newGearMod = new GearMod();
      newGearMod.setName(gearMod.getName());
      newGearMod.setType(gearMod.getType());
      return gearmodrepos.save(newGearMod);
   }
}
