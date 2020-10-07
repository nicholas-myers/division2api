package com.api.division2.controllers;

import com.api.division2.models.GearTalent;
import com.api.division2.services.GearTalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gearTalents")
public class GearTalentController
{
   @Autowired
   private GearTalentService gearTalentService;

   @GetMapping(value = "/all", produces = {"application/json"})
   public ResponseEntity<?> getAllGearTalents()
   {
      List<GearTalent> allGearTalents = gearTalentService.findAllGearTalents();
      return new ResponseEntity<>(allGearTalents, HttpStatus.OK);
   }
}
