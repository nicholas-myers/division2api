package com.api.division2.controllers;

import com.api.division2.models.GearMod;
import com.api.division2.services.GearModService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gearMods")
public class GearModController
{
   @Autowired
   private GearModService gearModService;

   @GetMapping(value = "/all", produces = {"application/json"})
   public ResponseEntity<?> getAllGearMods()
   {
      List<GearMod> allGearMods = gearModService.findAllGearMods();
      return new ResponseEntity<>(allGearMods, HttpStatus.OK);
   }
}
