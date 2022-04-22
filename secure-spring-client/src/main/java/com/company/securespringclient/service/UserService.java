package com.company.securespringclient.service;

import com.company.securespringclient.entity.User;
import com.company.securespringclient.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);
}
