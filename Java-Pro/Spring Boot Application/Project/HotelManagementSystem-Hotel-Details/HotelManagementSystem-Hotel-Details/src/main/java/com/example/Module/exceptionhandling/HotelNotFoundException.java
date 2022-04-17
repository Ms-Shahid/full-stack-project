package com.example.Module.exceptionhandling;


public class HotelNotFoundException extends RuntimeException {


    /**
     *
     */

    public HotelNotFoundException(String message) {
        super(message);

    }

}