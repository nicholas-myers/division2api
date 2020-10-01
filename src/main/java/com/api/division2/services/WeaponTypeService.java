package com.api.division2.services;

import com.api.division2.models.WeaponType;

import java.util.List;

public interface WeaponTypeService
{
   List<WeaponType> findAllWeaponTypes();
   WeaponType save(WeaponType newWeaponType);
}
