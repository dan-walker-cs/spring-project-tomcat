package com.springproject.springfullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;


// This class handles the redirection logic after a successful login attempt
@Controller
public class AuthSuccessController {

   // Redirects the principal based on their role
    @RequestMapping("/authsuccess")
    public String authSuccessRedirect(HttpServletRequest request) {
        if(request.isUserInRole("ADMIN")) {
            return "redirect:/admin";
        }
        return "redirect:/user";
    }
}
