package com.example.course.services;

import com.example.course.dto.UserDTO;
import com.example.course.entities.User;
import com.example.course.repository.UserRepository;
import com.example.course.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository rep;
    public List<User> findAll(){
    return  rep.findAll();
    }
    public User findById(String id){
        Optional<User> user = rep.findById(id);
        return user.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public User insert(User obj){
        return  rep.insert(obj);
    }
    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(),objDTO.getName(),objDTO.getEmail());
    }

    public  void delete(String id){
        findById(id);
        rep.deleteById(id);
    }
    public User update( User obj){
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return  rep.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }
}
