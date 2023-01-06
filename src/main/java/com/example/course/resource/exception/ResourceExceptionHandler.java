package com.example.course.resource.exception;

import com.example.course.services.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//tratar possiveis error nas requisições
@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        StandartError err = new StandartError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),"Não encontrado",e.getMessage(),request.getRequestURI());
    return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}