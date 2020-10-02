package com.api.division2;

import com.api.division2.models.ExoticWeapon;
import com.api.division2.models.WeaponTalent;
import com.api.division2.models.WeaponType;
import com.api.division2.services.ExoticWeaponService;
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

   @Autowired
   ExoticWeaponService exoticWeaponService;

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
      /********* END WEAPON TALENTS ***********/
      /********* EXOTIC WEAPONS ***********/
      ExoticWeapon bighorn = new ExoticWeapon("The Bighorn", "Big Game Hunter", "When scoped: switches to semi-automatic fire mode, dealing 450% weapon damage with each shot.", ar);
      bighorn = exoticWeaponService.save(bighorn);
      ExoticWeapon chameleon = new ExoticWeapon("Chameleon", "Adaptive Instincts", "Hitting 30 headshots grants 20% critical hit chance and 50% critical hit damage for 45 seconds. Hitting 60 body shots grants 80% weapon damage for 45 seconds. Hitting 30 leg shots grants 150% reload speed for 45 seconds.", ar);
      chameleon = exoticWeaponService.save(chameleon);
      ExoticWeapon bulletking = new ExoticWeapon("Bullet King", "Bullet Hell", "This weapon never needs to be reloaded.\n" +
              "\n" +
              "For every 100 bullets that hit an enemy, replenish some ammo to you and your allies' reserves.", lmg);
      bulletking = exoticWeaponService.save(bulletking);
      ExoticWeapon pestilence = new ExoticWeapon("Pestilence", "Plague of the Outcasts", "Hits apply a debuff dealing 100% weapon damage over 10 seconds. This stacks up to 50 times.\n" +
              "\n" +
              "Whenever an enemy dies with this debuff, all stacks are transferred to a nearby enemy within 25 meters.", lmg);
      pestilence = exoticWeaponService.save(pestilence);
      ExoticWeapon nemesis = new ExoticWeapon("Nemesis", "Electromagnetic Accelerator", "Shots fired deal 0 -100% weapon damage based on how long the trigger is held before releasing.", mmr);
      nemesis = exoticWeaponService.save(nemesis);
      ExoticWeapon regulus = new ExoticWeapon("Regulus", "Regicide", "Headshot kills deals 400% weapon damage and applies bleed to enemies within 5 meters of the enemy killed.", pistol);
      regulus = exoticWeaponService.save(regulus);
      ExoticWeapon liberty = new ExoticWeapon("Liberty", "Liberty or Death", "Gain a stack on each hit, up to 30.\n" +
              "\n" +
              "Headshots consume all stacks, repairing your shield for 3% per stack.", pistol);
      liberty = exoticWeaponService.save(liberty);
      ExoticWeapon ravenous = new ExoticWeapon("The Ravenous", "Geri and Freki", "Right shoulder, hits add offensive primers. Left shoulder, defensive primers. Hits detonate opposite shoulder's primers. Offensive primer deals 75% weapon damage. Defensive primer grants 2% bonus armor for 5 seconds. Primer effect doubled at 10 stacks.", rifle);
      ravenous = exoticWeaponService.save(ravenous);
      ExoticWeapon diamondback = new ExoticWeapon("Diamondback", "Agonizing Bite", "Diamondback randomly marks an enemy.\n" +
              "\n" +
              "Hitting that enemy consumes the mark, guaranteeing a critical hit with damage amplified by 20%.\n" +
              "\n" +
              "A new random enemy is marked afterwards and whenever you reload.", rifle);
      diamondback = exoticWeaponService.save(diamondback);
      ExoticWeapon mercyruth = new ExoticWeapon("Merciless / Ruthless", "Binary Trigger", "This weapon is equipped with a binary trigger that fires on trigger pull and release.\n" +
              "\n" +
              "If both bullets hit the same enemy, gain a stack.\n" +
              "\n" +
              "At 7 stacks, shooting an enemy creates a 7 meter explosion dealing 900% weapon damage, consuming the stacks.", rifle);
      mercyruth = exoticWeaponService.save(mercyruth);
      ExoticWeapon sweetlullaby = new ExoticWeapon("Sweet Dreams / Lullaby", "Sandman", "Melee attacks instantly kill non-elite enemies.\n" +
              "\n" +
              "Cooldown: 15 seconds.", shotgun);
      sweetlullaby = exoticWeaponService.save(sweetlullaby);
      ExoticWeapon ladydeath = new ExoticWeapon("Lady Death", "Breathe Free", "When moving, gain 4 stacks per second, or 8 stacks if sprinting, up to 40 stacks total.\n" +
              "\n" +
              "Each round fired consumes a stack, amplifying damage by 60%.\n" +
              "\n" +
              "Kills grant 20% movement speed for 10 seconds.", smg);
      ladydeath = exoticWeaponService.save(ladydeath);
      ExoticWeapon chatterbox = new ExoticWeapon("The Chatterbox", "Incessant Chatter", "When you reload, rate of fire is increased by 20% for each enemy within 15 meters for the duration of that magazine.\n" +
              "\n" +
              "Max stacks: 5.\n" +
              "\n" +
              "Kills refill 50% of your magazine.", smg);
      chatterbox = exoticWeaponService.save(chatterbox);
      /********* END EXOTIC WEAPONS ***********/
   }
}
