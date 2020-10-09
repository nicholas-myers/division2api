package com.api.division2.controllers;

import com.api.division2.models.BrandSet;
import com.api.division2.services.BrandSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ListResourceBundle;

@RestController
@RequestMapping("/brandSets")
public class BrandSetController
{
   @Autowired
   private BrandSetService brandSetService;

   @GetMapping(value = "/all", produces = {"application/json"})
   public ResponseEntity<?> getAllBrandSets()
   {
      List<BrandSet> allBrandSets = brandSetService.findAllBrandSets();

      return new ResponseEntity<>(allBrandSets, HttpStatus.OK);
   }
}
