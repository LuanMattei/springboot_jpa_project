package com.example.course.entities;

import com.example.course.dto.AuthorDTO;
import com.example.course.dto.CommentDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    private List<CommentDTO> comments = new ArrayList<>();
}
