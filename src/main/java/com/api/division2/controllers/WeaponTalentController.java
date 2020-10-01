package com.api.division2.controllers;

import com.api.division2.models.WeaponTalent;
import com.api.division2.services.WeaponTalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weaponTalents")
public class WeaponTalentController
{
   @Autowired
   private WeaponTalentService weaponTalentService;

   @GetMapping(value = "/all",
   produces = {"application/json"})
   public ResponseEntity<?> getAllWeaponTalents()
   {
      List<WeaponTalent> allWeaponTalents = weaponTalentService.findAllWeaponTalents();
      return new ResponseEntity<>(allWeaponTalents, HttpStatus.OK);
   }
}
