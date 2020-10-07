package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "gearattributes")
public class GearAttribute
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long gearAttributeId;

   @NotNull
   @Column(nullable = false,
           unique = true)
   private String name;

   @NotNull
   @Column(nullable = false)
   private String maxBonus;

   @NotNull
   @Column(nullable = false)
   private String type;

   public GearAttribute()
   {
   }

   public GearAttribute(String name, String maxBonus, String type)
   {
      this.name = name;
      this.maxBonus = maxBonus;
      this.type = type;
   }

   public long getGearAttributeId()
   {
      return gearAttributeId;
   }

   public void setGearAttributeId(long gearAttributeId)
   {
      this.gearAttributeId = gearAttributeId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getMaxBonus()
   {
      return maxBonus;
   }

   public void setMaxBonus(String maxBonus)
   {
      this.maxBonus = maxBonus;
   }

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }
}
