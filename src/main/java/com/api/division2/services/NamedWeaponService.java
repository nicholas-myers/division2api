package com.api.division2.services;

import com.api.division2.models.NamedWeapon;

import java.util.List;

public interface NamedWeaponService
{
   List<NamedWeapon> findAllNamedWeapons();
   NamedWeapon save(NamedWeapon namedWeapon);
}
