package com.api.division2.services;

import com.api.division2.models.BrandSet;

import java.util.List;

public interface BrandSetService
{
   List<BrandSet> findAllBrandSets();

   BrandSet save(BrandSet brandSet);
}
