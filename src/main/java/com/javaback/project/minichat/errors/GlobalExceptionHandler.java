//package com.javaback.project.minichat.errors;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
//    public ResponseEntity<Object> handleGenericException(Exception ex, WebRequest request) {
//        return new ResponseEntity<>("Error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
