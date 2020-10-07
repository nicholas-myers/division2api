package com.api.division2.services;

import com.api.division2.models.GearAttribute;
import com.api.division2.repositories.GearAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "gearAttributeService")
public class GearAttributeServiceImpl implements GearAttributeService
{
   @Autowired
   private GearAttributeRepository gearattrrepos;

   @Override
   public List<GearAttribute> findAllGearAttributes()
   {
      List<GearAttribute> allGearAttributes = new ArrayList<>();

      gearattrrepos.findAll().iterator().forEachRemaining(allGearAttributes::add);
      return allGearAttributes;
   }

   @Transactional
   @Override
   public GearAttribute save(GearAttribute gearAttribute)
   {
      GearAttribute newGearAttribute = new GearAttribute();

      newGearAttribute.setName(gearAttribute.getName());
      newGearAttribute.setMaxBonus(gearAttribute.getMaxBonus());
      newGearAttribute.setType(gearAttribute.getType());
      return gearattrrepos.save(newGearAttribute);
   }
}
