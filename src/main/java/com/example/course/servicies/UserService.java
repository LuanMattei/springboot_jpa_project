package com.example.course.servicies;

import com.example.course.entities.User;
import com.example.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository rep;
    public List<User> findAll(){
    return  rep.findAll();
    }
}
