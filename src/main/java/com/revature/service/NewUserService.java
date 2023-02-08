package com.revature.service;

import com.revature.model.NewUser;

@Service
public class NewUserService {

    public NewUserService registerUser(String login, String password, String username) {
        if (login != null && password != null) {
            return null;
        } else {
            NewUser newUser = new NewUser();
            newUser.setLogin(login);
            newUser.setPassword(password);
            newUser.setUsername(username);
            return staffRepository.save()
        }

    }
