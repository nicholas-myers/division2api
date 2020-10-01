package com.api.division2.services;

import com.api.division2.models.WeaponType;
import com.api.division2.repositories.WeaponTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "weaponTypeService")
public class WeaponTypeServiceImpl implements WeaponTypeService
{
   @Autowired
   private WeaponTypeRepository weapontyperepos;

   @Override
   public List<WeaponType> findAllWeaponTypes()
   {
      List<WeaponType> allWeaponTypes = new ArrayList<>();

      weapontyperepos.findAll().iterator().forEachRemaining(allWeaponTypes::add);
      return allWeaponTypes;
   }

   @Transactional
   @Override
   public WeaponType save(WeaponType weaponType)
   {
      WeaponType newWeaponType = new WeaponType();

      newWeaponType.setName(weaponType.getName());

      return weapontyperepos.save(newWeaponType);
   }
}
