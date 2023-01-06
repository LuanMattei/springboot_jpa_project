package com.example.course.dto;

import com.example.course.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor

public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    public  AuthorDTO(User obj){
          id = obj.getId();
          name = obj.getName();
    }
}
