package com.api.division2.controllers;

import com.api.division2.models.ExoticGear;
import com.api.division2.services.ExoticGearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exoticGear")
public class ExoticGearController
{
   @Autowired
   private ExoticGearService exoticGearService;

   @GetMapping(value = "/all", produces = {"application/json"})
   public ResponseEntity<?> getAllExoticGear()
   {
      List<ExoticGear> allExoticGear = exoticGearService.findAllExoticGear();
      return new ResponseEntity<>(allExoticGear, HttpStatus.OK);
   }
}
