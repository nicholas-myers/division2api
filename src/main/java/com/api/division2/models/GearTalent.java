package com.api.division2.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "geartalents")
public class GearTalent
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long gearTalentId;

   @NotNull
   @Column(nullable = false, unique = true)
   private String name;

   @NotNull
   @Column(nullable = false, unique = true)
   private String description;

   @NotNull
   @Column(nullable = false)
   private String bodyPosition;

   public GearTalent()
   {
   }

   public GearTalent(String name, String description, String bodyPosition)
   {
      this.name = name;
      this.description = description;
      this.bodyPosition = bodyPosition;
   }

   public long getGearTalentId()
   {
      return gearTalentId;
   }

   public void setGearTalentId(long gearTalentId)
   {
      this.gearTalentId = gearTalentId;
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

   public String getBodyPosition()
   {
      return bodyPosition;
   }

   public void setBodyPosition(String bodyPosition)
   {
      this.bodyPosition = bodyPosition;
   }
}
