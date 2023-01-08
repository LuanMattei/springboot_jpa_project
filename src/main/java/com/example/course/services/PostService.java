package com.example.course.services;

import com.example.course.dto.UserDTO;
import com.example.course.entities.Post;
import com.example.course.entities.User;
import com.example.course.repository.PostRepository;
import com.example.course.repository.UserRepository;
import com.example.course.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository rep;
    public List<Post> findAll(){
        return  rep.findAll();
    }
    public Post findById(String id){
        Optional<Post> post = rep.findById(id);
        return post.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<Post> findByTitle(String text) {
        return rep.findByTitleContaining(text);
    }
}
