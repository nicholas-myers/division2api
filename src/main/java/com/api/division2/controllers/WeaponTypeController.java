package com.api.division2.controllers;

import com.api.division2.models.WeaponType;
import com.api.division2.services.WeaponTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weaponTypes")
public class WeaponTypeController
{
   @Autowired
   private WeaponTypeService weaponTypeService;

   @GetMapping(value = "/weaponTypes", produces = {"application/json"})
   public ResponseEntity<?> getAllWeaponTypes()
   {
      List<WeaponType> allWeaponTypes = weaponTypeService.findAllWeaponTypes();
      return new ResponseEntity<>(allWeaponTypes, HttpStatus.OK);
   }
}
