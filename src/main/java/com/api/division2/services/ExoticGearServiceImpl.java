package com.api.division2.services;

import com.api.division2.models.ExoticGear;
import com.api.division2.repositories.ExoticGearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "exoticGearService")
public class ExoticGearServiceImpl implements ExoticGearService
{
   @Autowired
   private ExoticGearRepository exoticgearrepos;

   @Override
   public List<ExoticGear> findAllExoticGear()
   {
      List<ExoticGear> allExoticGear = new ArrayList<>();

      exoticgearrepos.findAll().iterator().forEachRemaining(allExoticGear::add);
      return allExoticGear;
   }

   @Transactional
   @Override
   public ExoticGear save(ExoticGear exoticGear)
   {
      ExoticGear newExoticGear = new ExoticGear();

      newExoticGear.setName(exoticGear.getName());
      newExoticGear.setTalentName(exoticGear.getTalentName());
      newExoticGear.setTalentDescription(exoticGear.getTalentDescription());
      newExoticGear.setBodyposition(exoticGear.getBodyposition());
      return exoticgearrepos.save(newExoticGear);
   }
}
