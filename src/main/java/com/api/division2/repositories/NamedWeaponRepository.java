package com.api.division2.repositories;

import com.api.division2.models.NamedWeapon;
import org.springframework.data.repository.CrudRepository;

public interface NamedWeaponRepository extends CrudRepository<NamedWeapon, Long>
{
}
