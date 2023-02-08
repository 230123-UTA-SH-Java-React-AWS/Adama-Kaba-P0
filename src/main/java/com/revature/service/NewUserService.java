package com.revature.service;

import com.revature.model.NewUser;
import com.revature.repository.StaffRepository;

@Service
public class NewUserService {
    private final StaffRepository staffRepository;

    public NewUserService(StaffRepository staffRepository) {
        this.staffRepository = staffrepository;
    }


    public NewUser registerUser(String login, String password, String username) {
        if (username != null && password != null) {
            return null;
        } else {
            NewUser newUser = new NewUser();
            newUser.setLogin(login);
            newUser.setPassword(password);
            newUser.setUsername(username);
            return StaffRepository.save(NewUser);
        }
    }

    public NewUser validation(String password, String username) {
        return staffRepository.findByUsernameAndPassword(username, password),orElse(null);
    }
}
