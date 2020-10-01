package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "weapontypes")
public class WeaponType
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long weaponTypeId;

   @NotNull
   @Column(nullable = false, unique = true)
   private String name;

   public WeaponType(String name)
   {
      this.name = name;
   }

   public long getWeaponTypeId()
   {
      return weaponTypeId;
   }

   public void setWeaponTypeId(long weaponTypeId)
   {
      this.weaponTypeId = weaponTypeId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
}
