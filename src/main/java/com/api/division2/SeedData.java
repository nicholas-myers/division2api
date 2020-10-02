package com.api.division2;

import com.api.division2.models.WeaponTalent;
import com.api.division2.models.WeaponType;
import com.api.division2.services.WeaponTalentService;
import com.api.division2.services.WeaponTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
   @Autowired
   WeaponTypeService weaponTypeService;

   @Autowired
   WeaponTalentService weaponTalentService;

   @Transactional
   @Override
   public void run(String[] args)
      throws Exception
   {
      /******* WEAPON TYPES ********/
      WeaponType ar = new WeaponType("Assault Rifle");
      ar = weaponTypeService.save(ar);
      WeaponType rifle = new WeaponType("Rifle");
      rifle = weaponTypeService.save(rifle);
      WeaponType mmr = new WeaponType("Marksman Rifle");
      mmr = weaponTypeService.save(mmr);
      WeaponType smg = new WeaponType("Submachine Gun");
      smg = weaponTypeService.save(smg);
      WeaponType lmg = new WeaponType("Light Machine Gun");
      lmg = weaponTypeService.save(lmg);
      WeaponType pistol = new WeaponType("Pistol");
      pistol = weaponTypeService.save(pistol);
      WeaponType shotgun = new WeaponType("Shotgun");
      shotgun = weaponTypeService.save(shotgun);

      /******* WEAPON TALENTS ********/
      WeaponTalent boomerang = new WeaponTalent("Boomerang", "Critical hits have a 50% chance to return the bullet to the magazine. If a bullet is returned to the magazine, the next shot has 40% increased damage.");
      List<WeaponType> talentTypes = new ArrayList<>();
      talentTypes.add(rifle);
      boomerang.setWeaponTypes(talentTypes);
      boomerang = weaponTalentService.save(boomerang);
      WeaponTalent breadbasket = new WeaponTalent("Breadbasket", "Landing body shots adds a stack of bonus 35% headshot damage to the next headshot for 10 seconds. Max stack is 3.");
      talentTypes = new ArrayList<>();
      talentTypes.add(ar);
      talentTypes.add(rifle);
      talentTypes.add(mmr);
      talentTypes.add(smg);
      talentTypes.add(lmg);
      talentTypes.add(pistol);
      talentTypes.add(shotgun);
      breadbasket.setWeaponTypes(talentTypes);
      breadbasket = weaponTalentService.save(breadbasket);
      WeaponTalent closepersonal = new WeaponTalent("Close and Personal", "Killing a target within 7 meters grants 30% weapon damage for 10 seconds.");
      talentTypes = new ArrayList<>();
      talentTypes.add(ar);
      talentTypes.add(rifle);
      talentTypes.add(mmr);
      talentTypes.add(smg);
      talentTypes.add(lmg);
      talentTypes.add(pistol);
      talentTypes.add(shotgun);
      closepersonal.setWeaponTypes(talentTypes);
      closepersonal = weaponTalentService.save(closepersonal);
      WeaponTalent eyeless = new WeaponTalent("Eyless", "Deal 20% weapon damage to blinded enemies. After 4 kills, applies blind to the next enemy you hit.");
      talentTypes = new ArrayList<>();
      talentTypes.add(ar);
      talentTypes.add(rifle);
      talentTypes.add(mmr);
      talentTypes.add(smg);
      talentTypes.add(lmg);
      talentTypes.add(pistol);
      talentTypes.add(shotgun);
      eyeless.setWeaponTypes(talentTypes);
      eyeless = weaponTalentService.save(eyeless);

   }
}
