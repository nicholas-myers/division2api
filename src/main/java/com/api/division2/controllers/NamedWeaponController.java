package com.api.division2.controllers;

import com.api.division2.models.NamedWeapon;
import com.api.division2.services.NamedWeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/namedWeapons")
public class NamedWeaponController
{
   @Autowired
   private NamedWeaponService namedWeaponService;

   @GetMapping(value = "/all", produces = {"application/json"})
   public ResponseEntity<?> getAllNamedWeapons()
   {
      List<NamedWeapon> allNamedWeapons = namedWeaponService.findAllNamedWeapons();
      return new ResponseEntity<>(allNamedWeapons, HttpStatus.OK);
   }
}
