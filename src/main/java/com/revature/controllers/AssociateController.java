package com.revature.controllers;

import com.revature.model.NewUser;

public class AssociateController {
    @GetMapping("/signup")
    public String getSignUp() {
        return "sign_up";

    }

    @GetMapping("/signin")
    public String getSignIn() {
        model.addAttribute("LoginRequest", new NewUser());
        return "sign_in";
    }
}@PostMapping("/register")
