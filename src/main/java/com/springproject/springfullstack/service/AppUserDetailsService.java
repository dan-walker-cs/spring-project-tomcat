package com.springproject.springfullstack.service;

import com.springproject.springfullstack.model.AppUserDetails;
import com.springproject.springfullstack.model.User;
import com.springproject.springfullstack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;


// Abstracts out user information retrieval. This service takes a username and returns an object
//      containing all user details needed by the AuthenticationProvider for authentication and authorization.
@Service
public class AppUserDetailsService implements UserDetailsService {

    // Injects instance of the UserRepository
    @Autowired
    UserRepository userRepository;

    // Returns UserDetails instance, to be authenticated against, for a given username.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Searches the repository for a username matching the parameter and populates a user instance
        Optional<User> user = userRepository.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not recognized."));

        return user.map(AppUserDetails::new).get();
    }
}
