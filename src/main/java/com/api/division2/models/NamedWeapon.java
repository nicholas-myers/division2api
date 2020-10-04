package com.api.division2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "namedweapons")
public class NamedWeapon
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long namedWeaponId;

   @NotNull
   @Column(nullable = false,
           unique = true)
   private String name;

   @NotNull
   @Column(nullable = false)
   private String talentName;

   @NotNull
   @Column(nullable = false)
   private String talentDescription;

   @NotNull
   @Column(nullable = false)
   private String dropLocation;

   @ManyToOne
   @JoinColumn(name = "weaponTypeId")
   private WeaponType type;

   @NotNull
   @Column(nullable = false)
   private String variant;

   public NamedWeapon()
   {
   }

   public NamedWeapon(String name, String talentName, String talentDescription, String dropLocation, WeaponType type, String variant)
   {
      this.name = name;
      this.talentName = talentName;
      this.talentDescription = talentDescription;
      this.dropLocation = dropLocation;
      this.type = type;
      this.variant = variant;
   }

   public long getNamedWeaponId()
   {
      return namedWeaponId;
   }

   public void setNamedWeaponId(long namedWeaponId)
   {
      this.namedWeaponId = namedWeaponId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getTalentName()
   {
      return talentName;
   }

   public void setTalentName(String talentName)
   {
      this.talentName = talentName;
   }

   public String getTalentDescription()
   {
      return talentDescription;
   }

   public void setTalentDescription(String talentDescription)
   {
      this.talentDescription = talentDescription;
   }

   public String getDropLocation()
   {
      return dropLocation;
   }

   public void setDropLocation(String dropLocation)
   {
      this.dropLocation = dropLocation;
   }

   public WeaponType getType()
   {
      return type;
   }

   public void setType(WeaponType type)
   {
      this.type = type;
   }

   public String getVariant()
   {
      return variant;
   }

   public void setVariant(String variant)
   {
      this.variant = variant;
   }
}
