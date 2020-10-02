package com.api.division2.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;

@Entity
@Table(name = "exoticweapons")
public class ExoticWeapon
{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long exoticWeaponId;

   @NotNull
   @Column(nullable = false,
           unique = true)
   private String exoticWeaponName;

   @NotNull
   @Column(nullable = false,
           unique = true)
   private String exoticTalentName;

   @NotNull
   @Column(nullable = false,
           unique = true)
   private String exoticTalentDescription;

   @ManyToOne
   @JoinColumn(name = "weaponTypeId")
   private WeaponType weaponType;

   public ExoticWeapon()
   {
   }

   public ExoticWeapon(String exoticWeaponName, String exoticTalentName, String exoticTalentDescription, WeaponType weaponType)
   {
      this.exoticWeaponName = exoticWeaponName;
      this.exoticTalentName = exoticTalentName;
      this.exoticTalentDescription = exoticTalentDescription;
      this.weaponType = weaponType;
   }

   public long getExoticWeaponId()
   {
      return exoticWeaponId;
   }

   public void setExoticWeaponId(long exoticWeaponId)
   {
      this.exoticWeaponId = exoticWeaponId;
   }

   public String getExoticWeaponName()
   {
      return exoticWeaponName;
   }

   public void setExoticWeaponName(String exoticWeaponName)
   {
      this.exoticWeaponName = exoticWeaponName;
   }

   public String getExoticTalentName()
   {
      return exoticTalentName;
   }

   public void setExoticTalentName(String exoticTalentName)
   {
      this.exoticTalentName = exoticTalentName;
   }

   public String getExoticTalentDescription()
   {
      return exoticTalentDescription;
   }

   public void setExoticTalentDescription(String exoticTalentDescription)
   {
      this.exoticTalentDescription = exoticTalentDescription;
   }

   public WeaponType getWeaponType()
   {
      return weaponType;
   }

   public void setWeaponType(WeaponType weaponType)
   {
      this.weaponType = weaponType;
   }
}
