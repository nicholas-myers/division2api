package com.api.division2.services;

import com.api.division2.models.ExoticWeapon;
import com.api.division2.repositories.ExoticWeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "exoticWeaponService")
public class ExoticWeaponServiceImpl implements ExoticWeaponService
{
   @Autowired
   private ExoticWeaponRepository exoticweaponrepos;

   @Override
   public List<ExoticWeapon> findAllExoticWeapons()
   {
      List<ExoticWeapon> allExoticWeapons = new ArrayList<>();
      exoticweaponrepos.findAll().iterator().forEachRemaining(allExoticWeapons::add);
      return allExoticWeapons;
   }

   @Transactional
   @Override
   public ExoticWeapon save(ExoticWeapon exoticWeapon)
   {
      ExoticWeapon newExoticWeapon = new ExoticWeapon();
      newExoticWeapon.setExoticWeaponName(exoticWeapon.getExoticWeaponName());
      newExoticWeapon.setExoticTalentName(exoticWeapon.getExoticTalentName());
      newExoticWeapon.setExoticTalentDescription(exoticWeapon.getExoticTalentDescription());
      newExoticWeapon.setWeaponType(exoticWeapon.getWeaponType());
      return exoticweaponrepos.save(newExoticWeapon);
   }
}
