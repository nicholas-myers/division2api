package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "brandsets")
public class BrandSet
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long brandSetId;

   @NotNull
   @Column(nullable = false, unique = true)
   private String brand;

   @NotNull
   @Column(nullable = false)
   private String coreAttribute;

   @NotNull
   @Column(nullable = false)
   private String onePieceBonus;

   @NotNull
   @Column(nullable = false)
   private String twoPieceBonus;

   @NotNull
   @Column(nullable = false)
   private String threePieceBonus;

   public BrandSet()
   {
   }

   public BrandSet(String brand, String coreAttribute, String onePieceBonus, String twoPieceBonus, String threePieceBonus)
   {
      this.brand = brand;
      this.coreAttribute = coreAttribute;
      this.onePieceBonus = onePieceBonus;
      this.twoPieceBonus = twoPieceBonus;
      this.threePieceBonus = threePieceBonus;
   }

   public long getBrandSetId()
   {
      return brandSetId;
   }

   public void setBrandSetId(long brandSetId)
   {
      this.brandSetId = brandSetId;
   }

   public String getBrand()
   {
      return brand;
   }

   public void setBrand(String brand)
   {
      this.brand = brand;
   }

   public String getCoreAttribute()
   {
      return coreAttribute;
   }

   public void setCoreAttribute(String coreAttribute)
   {
      this.coreAttribute = coreAttribute;
   }

   public String getOnePieceBonus()
   {
      return onePieceBonus;
   }

   public void setOnePieceBonus(String onePieceBonus)
   {
      this.onePieceBonus = onePieceBonus;
   }

   public String getTwoPieceBonus()
   {
      return twoPieceBonus;
   }

   public void setTwoPieceBonus(String twoPieceBonus)
   {
      this.twoPieceBonus = twoPieceBonus;
   }

   public String getThreePieceBonus()
   {
      return threePieceBonus;
   }

   public void setThreePieceBonus(String threePieceBonus)
   {
      this.threePieceBonus = threePieceBonus;
   }
}
