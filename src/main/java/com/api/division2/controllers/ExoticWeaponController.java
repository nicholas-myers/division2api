package com.api.division2.controllers;

import com.api.division2.models.ExoticWeapon;
import com.api.division2.models.WeaponTalent;
import com.api.division2.services.ExoticWeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exoticWeapons")
public class ExoticWeaponController
{
   @Autowired
   private ExoticWeaponService exoticWeaponService;

   @GetMapping(value = "/all",
           produces = {"application/json"})
   public ResponseEntity<?> getAllExoticWeapons()
   {
      List<ExoticWeapon> allExoticWeapons = exoticWeaponService.findAllExoticWeapons();
      return new ResponseEntity<>(allExoticWeapons, HttpStatus.OK);
   }
}
