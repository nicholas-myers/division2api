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
   private String talent;

   @ManyToOne
   @JoinColumn(name = "weaponTypeId")
   private WeaponType weaponType;

   public ExoticWeapon()
   {
   }

   public ExoticWeapon(String exoticWeaponName, String talent, WeaponType weaponType)
   {
      this.exoticWeaponName = exoticWeaponName;
      this.talent = talent;
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

   public String getTalent()
   {
      return talent;
   }

   public void setTalent(String talent)
   {
      this.talent = talent;
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
