package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "exoticgear")
public class ExoticGear
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long exoticGearId;

   @NotNull
   @Column(nullable = false, unique = true)
   private String name;

   @NotNull
   @Column(nullable = false)
   private String bodyposition;

   @NotNull
   @Column(nullable = false, unique = true)
   private String talentName;

   @NotNull
   @Column(nullable = false, unique = true)
   private String talentDescription;

   public ExoticGear()
   {
   }

   public ExoticGear(String name, String bodyposition, String talentName, String talentDescription)
   {
      this.name = name;
      this.bodyposition = bodyposition;
      this.talentName = talentName;
      this.talentDescription = talentDescription;
   }

   public long getExoticGearId()
   {
      return exoticGearId;
   }

   public void setExoticGearId(long exoticGearId)
   {
      this.exoticGearId = exoticGearId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getBodyposition()
   {
      return bodyposition;
   }

   public void setBodyposition(String bodyposition)
   {
      this.bodyposition = bodyposition;
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
}
