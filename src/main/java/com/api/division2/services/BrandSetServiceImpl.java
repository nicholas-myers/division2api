package com.api.division2.services;

import com.api.division2.models.BrandSet;
import com.api.division2.repositories.BrandSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "brandSetService")
public class BrandSetServiceImpl implements BrandSetService
{
   @Autowired
   private BrandSetRepository brandsetrepos;

   @Override
   public List<BrandSet> findAllBrandSets()
   {
      List<BrandSet> allBrandSets = new ArrayList<>();

      brandsetrepos.findAll().iterator().forEachRemaining(allBrandSets::add);
      return allBrandSets;
   }

   @Transactional
   @Override
   public BrandSet save(BrandSet brandSet)
   {
      BrandSet newBrandSet = new BrandSet();

      newBrandSet.setBrand(brandSet.getBrand());
      newBrandSet.setCoreAttribute(brandSet.getCoreAttribute());
      newBrandSet.setOnePieceBonus(brandSet.getOnePieceBonus());
      newBrandSet.setTwoPieceBonus(brandSet.getTwoPieceBonus());
      newBrandSet.setThreePieceBonus(brandSet.getThreePieceBonus());
      return brandsetrepos.save(newBrandSet);
   }
}
