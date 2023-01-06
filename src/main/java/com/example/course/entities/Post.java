package com.example.course.entities;

import com.example.course.dto.AuthorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Post  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private  String id;
    private  Date date;
    private  String title;
    private  String body;
    private AuthorDTO author;


}
