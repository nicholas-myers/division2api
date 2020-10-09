package com.api.division2;

import com.api.division2.models.*;
import com.api.division2.services.*;
import com.fasterxml.jackson.databind.util.Named;
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

   @Autowired
   NamedWeaponService namedWeaponService;

   @Autowired
   GearAttributeService gearAttributeService;

   @Autowired
   GearTalentService gearTalentService;

   @Autowired
   GearModService gearModService;

   @Autowired
   ExoticGearService exoticGearService;

   @Autowired
   BrandSetService brandSetService;

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
      WeaponTalent boomerang = new WeaponTalent(
              "Boomerang",
              "Critical hits have a 50% chance to return the bullet to the magazine. If a bullet is returned to the magazine, the next shot has 40% increased damage.");
      List<WeaponType> talentTypes = new ArrayList<>();
      talentTypes.add(rifle);
      boomerang.setWeaponTypes(talentTypes);
      boomerang = weaponTalentService.save(boomerang);
      WeaponTalent breadbasket = new WeaponTalent(
              "Breadbasket",
              "Landing body shots adds a stack of bonus 35% headshot damage to the next headshot for 10 seconds. Max stack is 3.");
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
      WeaponTalent closepersonal = new WeaponTalent(
              "Close and Personal",
              "Killing a target within 7 meters grants 30% weapon damage for 10 seconds.");
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
      WeaponTalent eyeless = new WeaponTalent(
              "Eyless",
              "Deal 20% weapon damage to blinded enemies. After 4 kills, applies blind to the next enemy you hit.");
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
      WeaponTalent fasthands = new WeaponTalent(
              "Fast Hands",
              "Critical hits add a stack of 4% reload speed bonus. Max stack is 40.");
      talentTypes = new ArrayList<>();
      talentTypes.add(ar);
      talentTypes.add(rifle);
      talentTypes.add(mmr);
      talentTypes.add(smg);
      talentTypes.add(lmg);
      talentTypes.add(pistol);
      talentTypes.add(shotgun);
      fasthands = weaponTalentService.save(fasthands);
      /********* END WEAPON TALENTS ***********/
      /********* EXOTIC WEAPONS ***********/
      ExoticWeapon bighorn = new ExoticWeapon(
              "The Bighorn",
              "Big Game Hunter",
              "When scoped: switches to semi-automatic fire mode, dealing 450% weapon damage with each shot.",
              ar);
      bighorn = exoticWeaponService.save(bighorn);
      ExoticWeapon chameleon = new ExoticWeapon(
              "Chameleon",
              "Adaptive Instincts",
              "Hitting 30 headshots grants 20% critical hit chance and 50% critical hit damage for 45 seconds. Hitting 60 body shots grants 80% weapon damage for 45 seconds. Hitting 30 leg shots grants 150% reload speed for 45 seconds.",
              ar);
      chameleon = exoticWeaponService.save(chameleon);
      ExoticWeapon bulletking = new ExoticWeapon("Bullet King",
              "Bullet Hell",
              "This weapon never needs to be reloaded.\n" +
              "\n" +
              "For every 100 bullets that hit an enemy, replenish some ammo to you and your allies' reserves.",
              lmg);
      bulletking = exoticWeaponService.save(bulletking);
      ExoticWeapon pestilence = new ExoticWeapon(
              "Pestilence",
              "Plague of the Outcasts",
              "Hits apply a debuff dealing 100% weapon damage over 10 seconds. This stacks up to 50 times.\n" +
              "\n" +
              "Whenever an enemy dies with this debuff, all stacks are transferred to a nearby enemy within 25 meters.",
              lmg);
      pestilence = exoticWeaponService.save(pestilence);
      ExoticWeapon nemesis = new ExoticWeapon(
              "Nemesis",
              "Electromagnetic Accelerator",
              "Shots fired deal 0 -100% weapon damage based on how long the trigger is held before releasing.",
              mmr);
      nemesis = exoticWeaponService.save(nemesis);
      ExoticWeapon regulus = new ExoticWeapon(
              "Regulus",
              "Regicide",
              "Headshot kills deals 400% weapon damage and applies bleed to enemies within 5 meters of the enemy killed.",
              pistol);
      regulus = exoticWeaponService.save(regulus);
      ExoticWeapon liberty = new ExoticWeapon(
              "Liberty",
              "Liberty or Death", "Gain a stack on each hit, up to 30.\n" +
              "\n" +
              "Headshots consume all stacks, repairing your shield for 3% per stack.",
              pistol);
      liberty = exoticWeaponService.save(liberty);
      ExoticWeapon ravenous = new ExoticWeapon(
              "The Ravenous",
              "Geri and Freki",
              "Right shoulder, hits add offensive primers. Left shoulder, defensive primers. Hits detonate opposite shoulder's primers. Offensive primer deals 75% weapon damage. Defensive primer grants 2% bonus armor for 5 seconds. Primer effect doubled at 10 stacks.",
              rifle);
      ravenous = exoticWeaponService.save(ravenous);
      ExoticWeapon diamondback = new ExoticWeapon(
              "Diamondback",
              "Agonizing Bite",
              "Diamondback randomly marks an enemy.\n" +
              "\n" +
              "Hitting that enemy consumes the mark, guaranteeing a critical hit with damage amplified by 20%.\n" +
              "\n" +
              "A new random enemy is marked afterwards and whenever you reload.",
              rifle);
      diamondback = exoticWeaponService.save(diamondback);
      ExoticWeapon mercyruth = new ExoticWeapon(
              "Merciless / Ruthless",
              "Binary Trigger",
              "This weapon is equipped with a binary trigger that fires on trigger pull and release.\n" +
              "\n" +
              "If both bullets hit the same enemy, gain a stack.\n" +
              "\n" +
              "At 7 stacks, shooting an enemy creates a 7 meter explosion dealing 900% weapon damage, consuming the stacks.",
              rifle);
      mercyruth = exoticWeaponService.save(mercyruth);
      ExoticWeapon sweetlullaby = new ExoticWeapon(
              "Sweet Dreams / Lullaby",
              "Sandman",
              "Melee attacks instantly kill non-elite enemies.\n" +
              "\n" +
              "Cooldown: 15 seconds.",
              shotgun);
      sweetlullaby = exoticWeaponService.save(sweetlullaby);
      ExoticWeapon ladydeath = new ExoticWeapon(
              "Lady Death",
              "Breathe Free",
              "When moving, gain 4 stacks per second, or 8 stacks if sprinting, up to 40 stacks total.\n" +
              "\n" +
              "Each round fired consumes a stack, amplifying damage by 60%.\n" +
              "\n" +
              "Kills grant 20% movement speed for 10 seconds.",
              smg);
      ladydeath = exoticWeaponService.save(ladydeath);
      ExoticWeapon chatterbox = new ExoticWeapon(
              "The Chatterbox",
              "Incessant Chatter",
              "When you reload, rate of fire is increased by 20% for each enemy within 15 meters for the duration of that magazine.\n" +
              "\n" +
              "Max stacks: 5.\n" +
              "\n" +
              "Kills refill 50% of your magazine.",
              smg);
      chatterbox = exoticWeaponService.save(chatterbox);
      /********* END EXOTIC WEAPONS ***********/

      /********* NAMED WEAPONS *********/
      NamedWeapon manic = new NamedWeapon(
              "Manic",
              "Perfectly Overflowing",
              "Every 2 reloads from empty increases your base magazine capacity by 100%.",
              "Dark Zone",
              ar,
              "AK-47");
      manic = namedWeaponService.save(manic);
      NamedWeapon invisiblehand = new NamedWeapon(
              "Invisible Hand",
              "Perfect Allegro",
              "Increase rate of fire by 12%.", "Light Zone / Dark Zone",
              ar,
              "AUG");
      invisiblehand = namedWeaponService.save(invisiblehand);
      NamedWeapon shieldsplinterer = new NamedWeapon(
              "Shield Splinterer",
              "Perfect Optimist",
              "Weapon damage is increased by 4% for every 10% ammo missing from the magazine.",
              "Hunter Crate / Cassie Mendoza",
              ar,
              "F2000");
      shieldsplinterer = namedWeaponService.save(shieldsplinterer);
      NamedWeapon burnout = new NamedWeapon(
              "Burn Out",
              "Perfect on Empty",
              "Reloading from empty grants 40% weapon handling for 10 seconds.",
              "Light Zone",
              ar,
              "FAMAS");
      burnout = namedWeaponService.save(burnout);
      NamedWeapon savagewolverine = new NamedWeapon(
              "Savage Wolverine",
              "Perfectly Close & Personal",
              "Killing a target within 7 meters grants 38% weapon damage for 10 seconds.",
              "Firewall Field Research",
              ar,
              "Honey Badger");
      savagewolverine = namedWeaponService.save(savagewolverine);
      NamedWeapon pyromaniac = new NamedWeapon(
              "Pyromaniac",
              "Perfectly Ignited",
              "Deal 25% weapon damage to burning enemies. After 3 kills, applies burning to the next enemy you hit.",
              "Light Zone",
              ar,
              "M4");
      pyromaniac = namedWeaponService.save(pyromaniac);
      NamedWeapon glorydaze = new NamedWeapon(
              "Glory Daze",
              "Perfectly Near Sighted",
              "Receive 100% stability at the cost of 35% optimal range.",
              "Light Zone / Dark Zone",
              ar,
              "P416"
      );
      glorydaze = namedWeaponService.save(glorydaze);
      NamedWeapon railsplitter = new NamedWeapon(
              "The Railsplitter",
              "Perfectly Accurate",
              "Increase accuracy by 50%.",
              "Dark Zone",
              ar,
              "TAR-21"
      );
      railsplitter = namedWeaponService.save(railsplitter);
      NamedWeapon tabularasa = new NamedWeapon(
              "Tabula Rasa",
              "Perfectly Steady Handed",
              "Hits grant a stack of 1% accuracy and stability.\n" +
                      "\n" +
                      "At 75 stacks, consumes them to refill the magazine.Every 2 reloads from empty increases your base magazine capacity by 100%.",
              "Light Zone",
              lmg,
              "L86"
      );
      tabularasa = namedWeaponService.save(tabularasa);
      NamedWeapon blackfriday = new NamedWeapon(
              "Black Friday",
              "Perfectly Unhinged",
              "Receive 22% weapon damage at the cost of 25% stability and 25% accuracy.",
              "Dark Zone",
              lmg,
              "M249"
      );
      blackfriday = namedWeaponService.save(blackfriday);
      NamedWeapon goodtimes = new NamedWeapon(
              "Good Times",
              "Perfect Fast Hands",
              "Critical hits add a stack of 8% reload speed bonus.\n" +
                      "\n" +
                      "Max stack is 40.",
              "Dark Zone",
              lmg,
              "M60"
      );
      goodtimes = namedWeaponService.save(goodtimes);
      NamedWeapon sleipner = new NamedWeapon(
              "Sleipner",
              "Perfect Frenzy",
              "For every 8 bullets in the magazine capacity, gain 3% rate of fire and 3% weapon damage for 5 seconds when reloading from empty.",
              "Gunner Field Research",
              lmg,
              "MG5"
      );
      sleipner = namedWeaponService.save(sleipner);
      NamedWeapon carnage = new NamedWeapon(
              "Carnage",
              "Perfect Sadist",
              "Deal +25% weapon damage to bleeding enemies. After 3 kills, applies bleed to the next enemy you hit.",
              "Light Zone / Dark Zone",
              lmg,
              "NEGEV"
      );
      carnage = namedWeaponService.save(carnage);
      NamedWeapon newreliable = new NamedWeapon(
              "New Reliable",
              "Perfectly Optimized",
              "Increase weapon handling by 30%.",
              "Light Zone / Dark Zone",
              lmg,
              "RPK-74"
      );
      newreliable = namedWeaponService.save(newreliable);
      NamedWeapon quietroar = new NamedWeapon(
              "Quiet Roar",
              "Perfect Overwhelm",
              "Suppressing an enemy, that is not currently suppressed, grants 12% weapon damage for 12 seconds.\n" +
                      "\n" +
                      "Max stack is 4.",
              "Light Zone",
              lmg,
              "Stoner LAMG"
      );
      quietroar = namedWeaponService.save(quietroar);
      NamedWeapon whitedeath = new NamedWeapon(
              "The White Death",
              "Headshot Damage",
              "137% Headshot Damage",
              "Light Zone / Dark Zone",
              mmr,
              "M44"
      );
      whitedeath = namedWeaponService.save(whitedeath);
      NamedWeapon ekimstick = new NamedWeapon(
              "Ekim's Long Stick",
              "Perfect Ranger",
              "Amplifies weapon damage by 2% for every 4 meters you are away from the target.",
              "Light Zone / Dark Zone",
              mmr,
              "Model 700"
      );
      ekimstick = namedWeaponService.save(ekimstick);
      NamedWeapon darkness = new NamedWeapon(
              "The Darkness",
              "Perfect Eyeless",
              "Deal 25% weapon damage to blinded enemies. After 3 kills, applies blind to the next enemy you hit.",
              "Light Zone / Dark Zone",
              mmr,
              "SCAR"
      );
      darkness = namedWeaponService.save(darkness);
      NamedWeapon designatedhitter = new NamedWeapon(
              "Designated Hitter",
              "Perfect Reformation",
              "Headshots grant 40% skill repair for 8 seconds.",
              "Light Zone",
              mmr,
              "SR-1"
      );
      designatedhitter = namedWeaponService.save(designatedhitter);
      NamedWeapon pinprick = new NamedWeapon(
              "Pinprick",
              "Perfect First Blood",
              "If scoped, your first twp shots fired from out of combat or after fully reloading from empty deal headshot damage to any part of the body hit. Requires a Scope with 8x magnification or higher.",
              "Dark Zone",
              mmr,
              "SRS"
      );
      pinprick = namedWeaponService.save(pinprick);
      NamedWeapon commando = new NamedWeapon(
              "Commando",
              "Perfectly Naked",
              "Hitting an enemy with no armor grants 50% headshot damage for 8 seconds.",
              "Light Zone / Dark Zone",
              mmr,
              "SVD"
      );
      commando = namedWeaponService.save(commando);
      NamedWeapon orbit = new NamedWeapon(
              "Orbit",
              "Perfect Finisher",
              "Swapping from this weapon within 10 seconds of killing an enemy grants 35% critical hit chance and 40% critical hit damage for 15 seconds.",
              "Dark Zone",
              pistol,
              "586 Magnum"
      );
      orbit = namedWeaponService.save(orbit);
      NamedWeapon sharpshooter = new NamedWeapon(
              "Sharpshooter 93R",
              "Perfect Unwavering",
              "Swapping to this weapon grants 400% weapon handling for 5 seconds. Kills refresh the buff. Swapping away disables this from all weapons for 5 seconds.",
              "Sharpshooter Specialization",
              pistol,
              "93R"
      );
      sharpshooter = namedWeaponService.save(sharpshooter);
      NamedWeapon survivalist = new NamedWeapon(
              "Survivalist D50",
              "Perfect Sadist",
              "Deal +25% weapon damage to bleeding enemies. After 3 kills, applies bleed to the next enemy you hit.",
              "Survivalist Specialization",
              pistol,
              "Desert Eagle"
      );
      survivalist = namedWeaponService.save(survivalist);
      NamedWeapon mozambique = new NamedWeapon(
              "Mozambique Special",
              "Perfect Breadbasket",
              "Landing body shots adds a stack of bonus 50% headshot damage to the next headshot for 10 seconds. Max stack is 2.",
              "Light Zone / Dark Zone",
              pistol,
              "M1911"
      );
      mozambique = namedWeaponService.save(mozambique);
      NamedWeapon maxim = new NamedWeapon(
              "Maxim 9",
              "Perfect Spike",
              "Headshots grant 25% skill damage for 8 seconds.",
              "Technician Specialization",
              pistol,
              "Maxim 9"
      );
      maxim = namedWeaponService.save(maxim);
      NamedWeapon compact = new NamedWeapon(
              "P320 XCompact",
              "Perfect Preservation",
              "Killing an enemy repairs 12% armor over 5 seconds. Headshot kills improves the repair to 24%.",
              "Gunner Specialization",
              pistol,
              "P320"
      );
      compact = namedWeaponService.save(compact);
      NamedWeapon lightningrod = new NamedWeapon(
              "Lightning Rod",
              "Perfect Salvage",
              "Killing a target has a 85% chance to refill the magazine.",
              "Light Zone",
              pistol,
              "PF45"
      );
      lightningrod = namedWeaponService.save(lightningrod);
      NamedWeapon diceros = new NamedWeapon(
              "Diceros Special",
              "Perfect Optimist",
              "Weapon damage is increased by 4% for every 10% ammo missing from the magazine.",
              "Demolitionist Specialization",
              pistol,
              "Rhino"
      );
      diceros = namedWeaponService.save(diceros);
      NamedWeapon australian = new NamedWeapon(
              "The Autstralian",
              "Perfect Boomerang",
              "Critical hits have a 75% chance to return the bullet to the magazine. If a bullet is returned to the magazine, the next shot has 50% increased damage.",
              "Dark Zone",
              rifle,
              "1886"
      );
      australian = namedWeaponService.save(australian);
      NamedWeapon bakersdozen = new NamedWeapon(
              "Baker's Dozen",
              "Perfect Lucky Shot",
              "Magazine capacity is increased by 30%. Missed shots from cover have a 100% chance to return to the magazine.",
              "Light Zone / Dark Zone",
              rifle,
              "M1A"
      );
      bakersdozen = namedWeaponService.save(bakersdozen);
      NamedWeapon surge = new NamedWeapon(
              "Surge",
              "Perfect Spike",
              "Headshots grant 25% skill damage for 8 seconds.",
              "Light Zone",
              rifle,
              "M4"
      );
      surge = namedWeaponService.save(surge);
      NamedWeapon everlastinggaze = new NamedWeapon(
              "Everlasting Gaze",
              "Perfect Perpetuation",
              "Headshots grant 50% status effect damage and duration to the next status effect you apply. Cooldown is 16 seconds.",
              "Dark Zone",
              rifle,
              "SCAR"
      );
      everlastinggaze = namedWeaponService.save(everlastinggaze);
      NamedWeapon artisttool = new NamedWeapon(
              "Artist's Tool",
              "Perfect Rifleman",
              "Landing headshots adds a stack of bonus 11% weapon damage for 5 seconds. Max stack is 6. Additional headshots refresh the duration.",
              "Light Zone",
              rifle,
              "SIG 716"
      );
      artisttool = namedWeaponService.save(artisttool);
      NamedWeapon rockroll = new NamedWeapon(
              "Rock n' Roll",
              "Perfectly Extra",
              "Increase magazine size by 50%.",
              "Dark Zone",
              shotgun,
              "AA-12"
      );
      rockroll = namedWeaponService.save(rockroll);
      NamedWeapon boomstick = new NamedWeapon(
              "Boomstick",
              "Perfect Pumped Up",
              "Reloading grants 5% weapon damage for 10 seconds. Stacks up to 5 times.",
              "Light Zone",
              shotgun,
              "Double Barrel"
      );
      boomstick = namedWeaponService.save(boomstick);
      NamedWeapon firestarter = new NamedWeapon(
              "Firestarter",
              "Primer Rounds",
              "Damaged enemies lose 50% burn resistance for 5 seconds.",
              "Light Zone",
              shotgun,
              "Double Barrel Sawed Off (Sidearm)"
      );
      firestarter = namedWeaponService.save(firestarter);
      NamedWeapon sendoff = new NamedWeapon(
              "The Send Off",
              "Perfectly Rooted",
              "While in cover, skills deployed from cover deploy with 30% damage or 30% healing for 15 seconds. Can only happen once every 60 seconds.",
              "Technician Field Research",
              shotgun,
              "KSG"
      );
      sendoff = namedWeaponService.save(sendoff);
      NamedWeapon cuelebre = new NamedWeapon(
              "Cuélebre",
              "Perfect Jazz Hands",
              "Increase reload speed by 30%.",
              "Light Zone / Dark Zone",
              shotgun,
              "M870"
      );
      cuelebre = namedWeaponService.save(cuelebre);
      NamedWeapon tsunami = new NamedWeapon(
              "Tsunami",
              "Perfect Pummel",
              "2 consecutive kills refill the magazine and grant 40% weapon damage for 10 seconds.",
              "Light Zone",
              shotgun,
              "SASG-12"
      );
      tsunami = namedWeaponService.save(tsunami);
      NamedWeapon enforcer = new NamedWeapon(
              "Enforcer",
              "Perfect Pummel",
              "2 consecutive kills refill the magazine and grant 40% weapon damage for 10 seconds.",
              "Pre-Order",
              shotgun,
              "SASG-12"
      );
      enforcer = namedWeaponService.save(enforcer);
      NamedWeapon grudge = new NamedWeapon(
              "The Grudge",
              "Perfectly Vindictive",
              "Killing an enemy with a status effect applied grants all group members within 20 meters, 158% critical hit chance and 18% critical hit damage for 20 seconds.",
              "Keener",
              smg,
              "CMMG Banshee"
      );
      grudge = namedWeaponService.save(grudge);
      NamedWeapon swapchain = new NamedWeapon(
              "Swap Chain",
              "Perfect Unwavering",
              "Swapping to this weapon grants 400% weapon handling for 5 seconds. Kills refresh the buff. Swapping away disables this from all weapons for 5 seconds.",
              "Light Zone / Dark Zone",
              smg,
              "MP7"
      );
      swapchain = namedWeaponService.save(swapchain);
      NamedWeapon safetydistance = new NamedWeapon(
              "Safety Distance",
              "Perfect Outsider",
              "After killing an enemy, gaint 125% optimal range and 125% accuracy for 10 seconds.",
              "Light Zone / Dark Zone",
              smg,
              "MPX"
      );
      safetydistance = namedWeaponService.save(safetydistance);
      NamedWeapon apartment = new NamedWeapon(
              "The Apartment",
              "Perfectly Measured",
              "The top half of the magazine has +20% rate of fire and -27% weapon damage. The bottom half of the magazine has -20% rate of fire and +33% weapon damage.",
              "Light Zone / Dark Zone",
              smg,
              "MPX"
      );
      apartment = namedWeaponService.save(apartment);
      NamedWeapon emelinesguard = new NamedWeapon(
              "Emeline's Guard",
              "Perfect Preservation",
              "Killing an enemy repairs 12% armor over 5 seconds. Headshot kills improves the repair to 24%.",
              "Light Zone",
              smg,
              "P90"
      );
      emelinesguard = namedWeaponService.save(emelinesguard);
      NamedWeapon coldrelations = new NamedWeapon(
              "Cold Relations",
              "Perfectly Strained",
              "Gain 10% critical hit damage for every 0.5 seconds you are firing. Stacks up to 8 times.",
              "Light Zone",
              smg,
              "PP-19"
      );
      coldrelations = namedWeaponService.save(coldrelations);
      NamedWeapon darkwinter = new NamedWeapon(
              "Dark Winter",
              "Perfectly Killer",
              "Killing an enemy with a critical hit grants 50% critical hit damage for 10 seconds.",
              "Dark Zone",
              smg,
              "PP-19"
      );
      darkwinter = namedWeaponService.save(darkwinter);
      /********* END NAMED WEAPONS *********/
      /********* GEAR ATTRIBUTES **********/
      GearAttribute skilltier = new GearAttribute("Skill Tier", "1", "Core");
      skilltier = gearAttributeService.save(skilltier);
      GearAttribute armor = new GearAttribute("Armor", "170,000", "Core");
      armor = gearAttributeService.save(armor);
      GearAttribute weapondamage = new GearAttribute("Weapon Damage", "15%", "Core");
      weapondamage = gearAttributeService.save(weapondamage);
      GearAttribute critchance = new GearAttribute("Crit Hit Chance", "6%", "Red: Offensive");
      critchance = gearAttributeService.save(critchance);
      GearAttribute critdamage = new GearAttribute("Crit Hit Damage", "10%", "Red: Offensive");
      critdamage = gearAttributeService.save(critdamage);
      GearAttribute headshotdamage = new GearAttribute("Headshot Damage", "12%", "Red: Offensive");
      headshotdamage = gearAttributeService.save(headshotdamage);
      GearAttribute weaponhandling = new GearAttribute("Weapon Handling", "14%", "Red: Offensive");
      weaponhandling = gearAttributeService.save(weaponhandling);
      GearAttribute armorregen = new GearAttribute("Armor Regeneration", "4,925", "Blue: Defensive");
      armorregen = gearAttributeService.save(armorregen);
      GearAttribute explosiveresistance = new GearAttribute("Explosive Resistance", "10%", "Blue: Defensive");
      explosiveresistance = gearAttributeService.save(explosiveresistance);
      GearAttribute hazardprotect = new GearAttribute("Hazard Protection", "10%", "Blue: Defensive");
      hazardprotect = gearAttributeService.save(hazardprotect);
      GearAttribute health = new GearAttribute("Health", "18,935", "Blue: Defensive");
      health = gearAttributeService.save(health);
      GearAttribute skilldamage = new GearAttribute("Skill Damage", "10%", "Yellow: Utility");
      skilldamage = gearAttributeService.save(skilldamage);
      GearAttribute skillhaste = new GearAttribute("Skill Haste", "12%", "Yellow: Utility");
      skillhaste = gearAttributeService.save(skillhaste);
      GearAttribute skillrepair = new GearAttribute("Skill Repair", "20%", "Yellow: Utility");
      skillrepair = gearAttributeService.save(skillrepair);
      GearAttribute statuseffects = new GearAttribute("Status Effects", "10%", "Yellow: Utility");
      statuseffects = gearAttributeService.save(statuseffects);
      /******* END GEAR ATTRIBUTES *********/
      /******* GEAR TALENTS *********/
      GearTalent tagteam = new GearTalent("Tag Team", "The last enemy you have damaged with a skill is marked. Dealing weapon damage that enemy consumes the mark to reduce active cooldowns by 4s. Cooldown: 4s.", "Chest");
      tagteam = gearTalentService.save(tagteam);
      /******* END GEAR TALENTS *********/
      /******* GEAR MODS *********/
      GearMod headdamage = new GearMod("Headshot Damage", "Red: Offensive");
      headdamage = gearModService.save(headdamage);
      GearMod criticalrange = new GearMod("Critical Range", "Red: Offensive");
      criticalrange = gearModService.save(criticalrange);
      GearMod optimalrange = new GearMod("Optimal Range", "Red: Offensive");
      optimalrange = gearModService.save(optimalrange);
      GearMod weaponhandle = new GearMod("Weapon Handling", "Red: Offensive");
      weaponhandle = gearModService.save(weaponhandle);
      GearMod damagearmor = new GearMod("Damage to Armor", "Red: Offensive");
      damagearmor = gearModService.save(damagearmor);
      GearMod damagehealth = new GearMod("Damage to Health", "Red: Offensive");
      damagehealth = gearModService.save(damagehealth);
      GearMod explosivedamage = new GearMod("Explosive Damage", "Yellow: Utility");
      explosivedamage = gearModService.save(explosivedamage);
      GearMod grenadedamage = new GearMod("Grenade Damage", "Yellow: Utility");
      grenadedamage = gearModService.save(grenadedamage);
      GearMod bleeddamage = new GearMod("Bleed Damage", "Yellow: Utility");
      bleeddamage = gearModService.save(bleeddamage);
      GearMod burndamage = new GearMod("Burn Damage", "Yellow: Utility");
      burndamage = gearModService.save(burndamage);
      GearMod reloadspeed = new GearMod("Reload Speed", "Yellow: Utility");
      reloadspeed = gearModService.save(reloadspeed);
      GearMod outgoinghealing = new GearMod("Extra Outgoing Healing", "Yellow: Utility");
      outgoinghealing = gearModService.save(outgoinghealing);
      GearMod armorkill = new GearMod("Armor on Kill", "Blue: Defensive");
      armorkill = gearModService.save(armorkill);
      GearMod armorregeneration = new GearMod("Armor /sec Regeneration", "Blue: Defensive");
      armorregeneration = gearModService.save(armorregeneration);
      GearMod incominghealing = new GearMod("Extra Income Healing", "Blue: Defensive");
      incominghealing = gearModService.save(incominghealing);
      GearMod healthregen = new GearMod("Health Regeneration", "Blue: Defensive");
      healthregen = gearModService.save(healthregen);
      GearMod skillhealth = new GearMod("Skill Health", "Blue: Defensive");
      skillhealth = gearModService.save(skillhealth);
      GearMod totalarmor = new GearMod("Total Armor", "Blue: Defensive");
      totalarmor = gearModService.save(totalarmor);
      GearMod bleedresist = new GearMod("Bleed Resistance", "Blue: Defensive");
      bleedresist = gearModService.save(bleedresist);
      GearMod blinddeafresist = new GearMod("Bleed/Deaf Resistance", "Blue: Defensive");
      blinddeafresist = gearModService.save(blinddeafresist);
      GearMod burnresist = new GearMod("Burn Resistance", "Blue: Defensive");
      burnresist = gearModService.save(burnresist);
      GearMod disorientresist = new GearMod("Disorient Resistance", "Blue: Defensive");
      disorientresist = gearModService.save(disorientresist);
      GearMod explosiveresist = new GearMod("Explosive Resistance", "Blue: Defensive");
      explosiveresist = gearModService.save(explosiveresist);
      GearMod eliteprotect = new GearMod("Protection from Elites", "Blue: Defensive");
      eliteprotect = gearModService.save(eliteprotect);
      /******* END GEAR MODS *********/
      /******* EXOTIC GEAR *********/
      ExoticGear acostabag = new ExoticGear("Acosta's Go-Bag", "Backpack", "One in Hand / Two in the Bag", "Damaging an enemy with a grenade grants +1 skill tier for 15 seconds. Grants overcharge if already at skill tier 6. Cooldown is 60 seconds. / +1 Armor Kit Capacity +3 Grenade Capacity +25% Ammo Capacity +10% Skill Repair +10% Status Effects" );
      acostabag = exoticGearService.save(acostabag);
      ExoticGear tardigrade = new ExoticGear("Tardigrade Armor System", "Chest", "Ablative Nano-Plating", "Whenever your or any ally's armor breaks, they gain 80% of your armor as bonus armor for 10 seconds. Cooldown per ally: 45 seconds Killing an enemy with your specialization weapon removes this cooldown for all allies." );
      tardigrade = exoticGearService.save(tardigrade);
      ExoticGear btsugloves = new ExoticGear("BTSU Gloves", "Gloves", "Transference Overclock", "Detonating a Hive refreshes all allies' skill cooldowns and grants them overcharge for 15 seconds. Allies receiving this effect are unable to benefit from it again for 120 seconds." );
      btsugloves = exoticGearService.save(btsugloves);
      ExoticGear dodgecityholster = new ExoticGear("Dodge City Gunslinger's Holster", "Holster", "Quick Draw", "While your pistol is holstered, gain a stacking buff every 0.5 seconds, up to 100. When you swap to it, your first shot consumes the buff and deals +10% damage per stack. Requires Pistol Equipped" );
      dodgecityholster = exoticGearService.save(dodgecityholster);
      ExoticGear imperialdynasty = new ExoticGear("Imperial Dynasty", "Holster", "Dragon's Glare", "While in combat, applies burn to the enemy closest to you within 20 meters. Cooldown: 40 seconds." );
      imperialdynasty = exoticGearService.save(imperialdynasty);
      ExoticGear ninjakneepads = new ExoticGear("Ninja Bike Messenger Kneepads", "Kneepads", "Parkour!", "Performing a cover to cover or vaulting reloads your drawn weapon." );
      ninjakneepads = exoticGearService.save(ninjakneepads);
      ExoticGear sawyerskeepads = new ExoticGear("Sawyer's Kneepads", "Kneepads", "Grace Under Fire", "Cannot be staggered by explosions. Staying in cover without firing for 6 - 12 seconds provides damage immunity while aiming for 1 - 2 seconds." );
      sawyerskeepads = exoticGearService.save(sawyerskeepads);
      ExoticGear coyotemask = new ExoticGear("Coyote's Mask", "Mask", "Pack Instincts", "You and all allies gain a bonus based on the distance of the last enemy you hit. 0 - 15 meters: +25% critical hit damage. 15 - 25 meters: +10% critical hit damage and +10% critical hit chance. 25 meters+: 25% critical hit chance." );
      coyotemask = exoticGearService.save(coyotemask);
      /******* END EXOTIC GEAR *********/
      /******* BRAND SETS *********/
      BrandSet fiveeleven = new BrandSet("5.11 Tactical", "Armor", "10% Health", "15% Extra Incoming Healing", "10% Hazard Protection");
      fiveeleven = brandSetService.save(fiveeleven);
      BrandSet airaldi = new BrandSet("Airaldi Holdings", "Weapon Damage", "10% Marksman Rifle Damage", "10% Headshot Damage", "5% Damage to Armor");
      airaldi = brandSetService.save(airaldi);
      BrandSet alps = new BrandSet("Alps Summit", "Skill Tier", "15% Skill Repair", "20% Skill Duration", "10% Cooldown Reduction");
      alps = brandSetService.save(alps);
      BrandSet badger = new BrandSet("Badger Tuff", "Armor", "10% Shotgun Damage", "5% Total Armor", "10% Armor on Kill");
      badger = brandSetService.save(badger);
      BrandSet ceska = new BrandSet("Česká Výroba", "Weapon Damage", "10% Critical Hit Chance", "10% Hazard Protection", "10% Health");
      ceska = brandSetService.save(ceska);
      BrandSet chinalight = new BrandSet("China Light", "Skill Tier", "15% Explosive Damage", "10% Cooldown Reduction", "10% Status Effects");
      chinalight = brandSetService.save(chinalight);
      BrandSet dandh = new BrandSet("Douglas & Harding", "Weapon Damage", "20% Pistol Damage", "10% Stability", "10% Accuracy");
      dandh = brandSetService.save(dandh);
      BrandSet fenris = new BrandSet("Fenris Group", "Weapon Damage", "10% Assault Rifle Damage", "10% Reload Speed", "10% Stability");
      fenris = brandSetService.save(fenris);
      BrandSet gilaguard = new BrandSet("Gila Guard", "Armor", "5% Total Armor", "10% Health", "1% Armor /sec Regeneration");
      gilaguard = brandSetService.save(gilaguard);
      BrandSet golangear = new BrandSet("Golan Gear", "Armor", "10% Status Effects", "1% Armor /sec Regeneration", "5% Total Armor");
      golangear = brandSetService.save(golangear);
      BrandSet grupo = new BrandSet("Grupo Sombra", "Weapon Damage", "15% Critical Hit Damage", "15% Explosive Damage", "10% Headshot Damage");
      grupo = brandSetService.save(grupo);
      BrandSet hanacorp = new BrandSet("Hana-U Corp", "Skill Tier", "10% Cooldown Reduction", "10% Skill Damage", "5% Weapon Damage");
      hanacorp = brandSetService.save(hanacorp);
      BrandSet murakami = new BrandSet("Murakami Industries", "Skill Tier", "20% Skill Duration", "15% Skill Repair", "10% Skill Damage");
      murakami = brandSetService.save(murakami);
      BrandSet overlord = new BrandSet("Overlord Armaments", "Weapon Damage", "10% Rifle Damage", "10% Accuracy", "10% Weapon Handling");
      overlord = brandSetService.save(overlord);
      BrandSet petrov = new BrandSet("Petrov Defense", "Weapon Damage", "10% LMG Damage", "10% Weapon Handling", "20% Ammo Capacity");
      petrov = brandSetService.save(petrov);
      BrandSet providence = new BrandSet("Providence Defense", "Weapon Damage", "10% Headshot Damage", "10% Critical Hit Chance", "10% Critical Hit Damage");
      providence = brandSetService.save(providence);
      BrandSet randk = new BrandSet("Richter & Kaiser", "Skill Tier", "15% Extra Incoming Healing", "10% Explosive Resistance", "15% Skill Repair");
      randk = brandSetService.save(randk);
      BrandSet sokolov = new BrandSet("Sokolov Concern", "Weapon Damage", "10% SMG Damage", "15% Critical Hit Damage", "10% Critical Hit Damage");
      sokolov = brandSetService.save(sokolov);
      BrandSet wyvern = new BrandSet("Wyvern Wear", "Skill Tier", "10% Skill Damage", "10% Status Effects", "20% Skill Duration");
      wyvern = brandSetService.save(wyvern);
      BrandSet yaahl = new BrandSet("Yaahl Gear", "Armor", "10% Hazard Protection", "5% Weapon Damage", "40% Pulse Resistance");
      yaahl = brandSetService.save(yaahl);
   }
}
