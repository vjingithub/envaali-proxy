package com.envaali.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EnvaaliAdviser {

    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    @ExceptionHandler(EnvaaliException.class)
    public String ResponseMessage(EnvaaliException exception){
//        return new EnvaaliException("this is my exception"); // Entity
        return null;
    }
}
