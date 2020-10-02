package com.api.division2.services;

import com.api.division2.models.ExoticWeapon;

import java.util.List;

public interface ExoticWeaponService
{
   List<ExoticWeapon> findAllExoticWeapons();
   ExoticWeapon save(ExoticWeapon exoticWeapon);
}
