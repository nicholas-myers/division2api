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
           joinColumns = @JoinColumn(name = "weaponTalentId"),
           inverseJoinColumns = @JoinColumn(name = "weaponTypeId"))
   private List<WeaponType> weaponTypes;


}
