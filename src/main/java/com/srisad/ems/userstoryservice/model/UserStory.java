package com.srisad.ems.userstoryservice.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "user_stories")
public class UserStory {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private Integer storyId;
   
   @Column(name="story_name")
   private String storyName;
   
   @Column(name="user_id")
   private int userId;
}
