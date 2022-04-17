package com.example.Module.exceptionhandling;

import java.net.http.HttpHeaders;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException
                                                                       ex,
                                                               HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(
                        (error -> error.getDefaultMessage()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HotelNotFoundException.class)
// This annotation is a custom exception response handler, which sends to client
    public ResponseEntity<?> handleHotelNotFoundException(HotelNotFoundException exception,
                                                          WebRequest request) {
        HotelErrorDetails HotelerrorHandler = new HotelErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(HotelerrorHandler, HttpStatus.NOT_FOUND);
    }
}