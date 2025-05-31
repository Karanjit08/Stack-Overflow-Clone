package com.portal.demo.services;

import com.portal.demo.entitites.UserProfile;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<UserProfile> createUser(UserProfile userProfile);
}
