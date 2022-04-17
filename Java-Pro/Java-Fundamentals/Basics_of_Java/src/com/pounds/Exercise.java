package com.pounds;
public class Exercise {

    public static void main(String[] args){
        Exercise exercise = new Exercise();
        exercise.celsiusToFahrenheit(25.0);
        exercise.fahrenheitToCelsius(25.0);
        
    }
    
    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }
    
    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) * fahrenheit - 32;
        return celsius;
    }
}