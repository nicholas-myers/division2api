package com.api.division2.services;

import com.api.division2.models.WeaponTalent;
import com.api.division2.repositories.WeaponTalentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "weaponTalentService")
public class WeaponTalentServiceImpl implements WeaponTalentService
{
   @Autowired
   private WeaponTalentRepository weapontalentrepos;

   @Override
   public List<WeaponTalent> findAllWeaponTalents()
   {
      List<WeaponTalent> allWeaponTypes = new ArrayList<>();

      weapontalentrepos.findAll().iterator().forEachRemaining(allWeaponTypes::add);
      return allWeaponTypes;
   }

   @Transactional
   @Override
   public WeaponTalent save(WeaponTalent weaponTalent)
   {
      WeaponTalent newWeaponTalent = new WeaponTalent();

      newWeaponTalent.setName(weaponTalent.getName());
      newWeaponTalent.setDescription(weaponTalent.getDescription());

      return weapontalentrepos.save(newWeaponTalent);
   }
}
