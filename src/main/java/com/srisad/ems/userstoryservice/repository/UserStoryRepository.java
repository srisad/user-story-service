package com.srisad.ems.userstoryservice.repository;

import com.srisad.ems.userstoryservice.model.UserStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, Integer> {
   
   List<UserStory> findUserStoriesByUserId(Integer userId);
   
}
