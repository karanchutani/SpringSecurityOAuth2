package com.example.demo.service.serviceImpl;

import com.example.demo.model.User;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User Service Impl.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    /**
     * @param userName
     * @return
     */

    public User getUserInfoByUserName(String userName) {
        return userDetailsRepository.findByPhoneNumber(userName);
    }

}
