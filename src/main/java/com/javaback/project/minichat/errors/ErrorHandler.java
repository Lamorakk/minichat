//package com.javaback.project.minichat.errors;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.NoHandlerFoundException;
//
//@ControllerAdvice
//public class ErrorHandler {
//
//    @ExceptionHandler(NoHandlerFoundException.class)
//    public ResponseEntity<String> handleNoHandlerFound(NoHandlerFoundException ex) {
//        return new ResponseEntity<>("No handler found for your request: " + ex.getRequestURL(), HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleGeneralError(Exception ex) {
//        return new ResponseEntity<>("General error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
