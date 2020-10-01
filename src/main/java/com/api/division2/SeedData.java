package com.api.division2;

import com.api.division2.models.WeaponType;
import com.api.division2.services.WeaponTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
   @Autowired
   WeaponTypeService weaponTypeService;

   @Transactional
   @Override
   public void run(String[] args)
      throws Exception
   {
      /******* WEAPON TYPES ********/
      WeaponType ar = new WeaponType("Assault Rifle");
      weaponTypeService.save(ar);
      WeaponType rifle = new WeaponType("Rifle");
      weaponTypeService.save(rifle);
      WeaponType mmr = new WeaponType("Marksman Rifle");
      weaponTypeService.save(mmr);
      WeaponType smg = new WeaponType("Submachine Gun");
      weaponTypeService.save(smg);
      WeaponType lmg = new WeaponType("Light Machine Gun");
      weaponTypeService.save(lmg);
      WeaponType pistol = new WeaponType("Pistol");
      weaponTypeService.save(pistol);
      WeaponType shotgun = new WeaponType("Shotgun");
      weaponTypeService.save(shotgun);
   }
}
