package com.portal.demo.dao;

import com.portal.demo.entitites.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserProfile,Integer> {

}
