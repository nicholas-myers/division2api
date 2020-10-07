package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "gearmods")
public class GearMod
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long gearModId;

   @NotNull
   @Column(nullable = false, unique = true)
   private String name;

   @NotNull
   @Column(nullable = false)
   private String type;

   public GearMod()
   {
   }

   public GearMod(String name, String type)
   {
      this.name = name;
      this.type = type;
   }

   public long getGearModId()
   {
      return gearModId;
   }

   public void setGearModId(long gearModId)
   {
      this.gearModId = gearModId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
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
