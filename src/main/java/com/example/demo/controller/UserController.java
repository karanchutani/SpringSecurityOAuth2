package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * User Controller
     */

    @GetMapping("/users")
    public ResponseEntity<String> getOauthUser() {
        System.out.println("User is fetching successfully with Oauth security");
        return new ResponseEntity<>("User is fetching successfully with Oauth security", HttpStatus.OK);
    }

}