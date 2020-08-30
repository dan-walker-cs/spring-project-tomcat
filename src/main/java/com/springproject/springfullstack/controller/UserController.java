package com.springproject.springfullstack.controller;


import com.springproject.springfullstack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;


// This class handles display for a user's account page
@Controller
public class UserController {

    // Dependency to be injected
    @Autowired
    UserRepository userRepository;


    // Displays the user.html template
    @RequestMapping("/user")
    public String userPage(ModelMap model, final HttpServletRequest request, Principal principal) {
        // current authenticated principal for the session
        final String currentUser = principal.getName();
        model.addAttribute("user", currentUser);
        return "user";
    }
}
