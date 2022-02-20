package com.gbs.plus.springbootapp2.exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ NoSuchElementException.class })
    public Map<String, String> handleNoSuchElementException(NoSuchElementException e, 
            HttpServletRequest request) {
        Map<String, String> response = new HashMap();
        response.put("status", HttpStatus.NOT_FOUND.toString());
        response.put("url", request.getRequestURL().toString());
        response.put("message", e.getMessage());
        return response;
    }


   
}
