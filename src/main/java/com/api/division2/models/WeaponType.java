package com.api.division2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

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

   @ManyToMany(mappedBy = "weaponTypes")
   @JsonIgnore
   private List<WeaponTalent> weaponTalents;

   @OneToMany(mappedBy = "weaponType", cascade = CascadeType.ALL)
   @JsonIgnore
   private List<ExoticWeapon> exoticWeapons;

   @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
   @JsonIgnore
   private List<NamedWeapon> namedWeapons;

   public WeaponType()
   {
   }

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

   public List<WeaponTalent> getWeaponTalents()
   {
      return weaponTalents;
   }

   public void setWeaponTalents(List<WeaponTalent> weaponTalents)
   {
      this.weaponTalents = weaponTalents;
   }

   public List<ExoticWeapon> getExoticWeapons()
   {
      return exoticWeapons;
   }

   public void setExoticWeapons(List<ExoticWeapon> exoticWeapons)
   {
      this.exoticWeapons = exoticWeapons;
   }

   public List<NamedWeapon> getNamedWeapons()
   {
      return namedWeapons;
   }

   public void setNamedWeapons(List<NamedWeapon> namedWeapons)
   {
      this.namedWeapons = namedWeapons;
   }
}
