package com.example.course.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@EqualsAndHashCode
@NoArgsConstructor

public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String text;
    private Date data;

    public CommentDTO(String text, Date data, AuthorDTO authorDTO) {
        this.text = text;
        this.data = data;
        this.authorDTO = authorDTO;
    }

    private AuthorDTO authorDTO;



}
