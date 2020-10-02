package com.api.division2.services;

import com.api.division2.models.WeaponTalent;

import java.util.List;

public interface WeaponTalentService
{
   List<WeaponTalent> findAllWeaponTalents();
   WeaponTalent save(WeaponTalent newWeaponTalent);
}
