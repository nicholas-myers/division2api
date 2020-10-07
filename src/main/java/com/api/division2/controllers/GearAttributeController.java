package com.api.division2.controllers;

import com.api.division2.models.GearAttribute;
import com.api.division2.services.GearAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gearAttributes")
public class GearAttributeController
{
   @Autowired
   private GearAttributeService gearAttributeService;

   @GetMapping(value = "/all",
           produces = {"application/json"})
   public ResponseEntity<?> getAllGearAttributes()
   {
      List<GearAttribute> allGearAttributes = gearAttributeService.findAllGearAttributes();
      return new ResponseEntity<>(allGearAttributes, HttpStatus.OK);
   }

}
