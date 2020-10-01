package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "weapontalents")
public class WeaponTalent
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long weaponTalentId;

   @NotNull
   @Column(nullable = false, unique = true)
   private String name;

   @NotNull
   @Column(nullable = false, unique = true)
   private String description;

   @ManyToMany
   @JoinTable(
           name = "talenttypes",
           joinColumns = @JoinColumn(name = "weaponTypeId"),
           inverseJoinColumns = @JoinColumn(name = "weaponTalentId"))
   private List<WeaponType> weaponTypes;

   public WeaponTalent()
   {
   }

   public WeaponTalent(String name, String description)
   {
      this.name = name;
      this.description = description;
      this.weaponTypes = weaponTypes;
   }

   public long getWeaponTalentId()
   {
      return weaponTalentId;
   }

   public void setWeaponTalentId(long weaponTalentId)
   {
      this.weaponTalentId = weaponTalentId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public List<WeaponType> getWeaponTypes()
   {
      return weaponTypes;
   }

   public void setWeaponTypes(List<WeaponType> weaponTypes)
   {
      this.weaponTypes = weaponTypes;
   }
}
