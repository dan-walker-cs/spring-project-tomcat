package com.springproject.springfullstack.controller;

import com.springproject.springfullstack.model.User;
import com.springproject.springfullstack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// This class handles display for the account registration page
@Controller
public class RegisterController {

    // Dependency to be injected
    @Autowired
    UserRepository userRepository;

    // Displays the register.html template
    @RequestMapping("/register")
    public String registrationPage(Model model) {
        // new instance to be populated
        User user = new User();
        // add instance to the template
        model.addAttribute("user", user);
        return "register";
    }

    // Pulls data from the registration template
    @PostMapping("/register")
    public String createUser(User user) {
        // default data
        user.setActive(true);
        user.setRoles("ROLE_USER");
        // add new user to DB
        userRepository.save(user);
        return "redirect:/";
    }
}
