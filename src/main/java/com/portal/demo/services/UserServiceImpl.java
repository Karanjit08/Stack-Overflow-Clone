package com.portal.demo.services;

import com.portal.demo.dao.UserDao;
import com.portal.demo.entitites.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseEntity<UserProfile> createUser(UserProfile userProfile) {
        // Initial contribution streak defaults to 0 (already set in entity)
        return new ResponseEntity<>(userDao.save(userProfile), HttpStatus.CREATED);
    }
}
