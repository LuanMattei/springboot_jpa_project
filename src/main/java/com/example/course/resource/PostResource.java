package com.example.course.resource;

import com.example.course.dto.UserDTO;
import com.example.course.entities.Post;
import com.example.course.entities.User;
import com.example.course.resource.util.URL;
import com.example.course.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@RestController
@RequestMapping(value = "/post")
public class PostResource {
    @Autowired
    PostService service ;
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  ResponseEntity<Post> findById(@PathVariable String id){
        Post post = service.findById(id);
        return ResponseEntity.ok().body(post);
    }
    @RequestMapping(value = "/titlesearch",method = RequestMethod.GET)
    public  ResponseEntity <List<Post>> findByText(@RequestParam(value="text",defaultValue = "") String text){
        text = URL.decodeParam(text);
        List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }
}
