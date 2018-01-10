package com.srisad.ems.userstoryservice.resource;

import com.srisad.ems.userstoryservice.model.UserStory;
import com.srisad.ems.userstoryservice.repository.UserStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user-stories")
public class UserStoryResource {
   
   @Autowired
   private UserStoryRepository userStoryRepository;
   
   @GetMapping("/{userId}")
   public List<Integer> getUserStoriesByUser(@PathVariable Integer userId) {
      System.out.println(userId instanceof Integer);
      return userStoryRepository.findUserStoriesByUserId(userId).stream()
                     .map(UserStory::getStoryId)
                    // .map(userStory -> userStory.getStoryId())
                     .collect(Collectors.toList());
   }
   
}
