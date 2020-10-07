package com.api.division2.services;

import com.api.division2.models.GearTalent;
import com.api.division2.repositories.GearTalentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "gearTalentService")
public class GearTalentServiceImpl implements GearTalentService
{
   @Autowired
   private GearTalentRepository geartalentrepos;

   @Override
   public List<GearTalent> findAllGearTalents()
   {
      List<GearTalent> allGearTalents = new ArrayList<>();
      geartalentrepos.findAll().iterator().forEachRemaining(allGearTalents::add);
      return allGearTalents;
   }

   @Transactional
   @Override
   public GearTalent save(GearTalent gearTalent)
   {
      GearTalent newGearTalent = new GearTalent();

      newGearTalent.setName(gearTalent.getName());
      newGearTalent.setDescription(gearTalent.getDescription());
      newGearTalent.setBodyPosition(gearTalent.getBodyPosition());
      return geartalentrepos.save(newGearTalent);
   }
}
