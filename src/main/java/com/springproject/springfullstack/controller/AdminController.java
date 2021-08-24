package com.springproject.springfullstack.controller;

import com.springproject.springfullstack.model.User;
import com.springproject.springfullstack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


// This class handles display for the admin overview page
@Controller
public class AdminController {

    // Dependency to be injected
    @Autowired
    UserRepository userRepository;

    // Displays the admin.html template
    @RequestMapping("/admin")
    public String adminPage(Model model) {
        // populates a list of users from the DB
        List<User> allUsers = new ArrayList<>();
        userRepository.findAll()
                .forEach(allUsers::add);
        // adds the list to the template
        model.addAttribute("allUsers", allUsers);
        return "admin";
    }
}
