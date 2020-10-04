package com.api.division2.services;

import com.api.division2.models.NamedWeapon;
import com.api.division2.repositories.NamedWeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "namedWeaponService")
public class NamedWeaponServiceImpl implements NamedWeaponService
{
   @Autowired
   private NamedWeaponRepository namedweaponrepos;

   @Override
   public List<NamedWeapon> findAllNamedWeapons()
   {
      List<NamedWeapon> allNamedWeapons = new ArrayList<>();

      namedweaponrepos.findAll().iterator().forEachRemaining(allNamedWeapons::add);
      return allNamedWeapons;
   }

   @Transactional
   @Override
   public NamedWeapon save(NamedWeapon namedWeapon)
   {
      NamedWeapon newNamedWeapon = new NamedWeapon();
      newNamedWeapon.setName(namedWeapon.getName());
      newNamedWeapon.setTalentName(namedWeapon.getTalentName());
      newNamedWeapon.setTalentDescription(namedWeapon.getTalentDescription());
      newNamedWeapon.setDropLocation(namedWeapon.getDropLocation());
      newNamedWeapon.setType(namedWeapon.getType());
      newNamedWeapon.setVariant(namedWeapon.getVariant());
      return namedweaponrepos.save(newNamedWeapon);
   }

}
