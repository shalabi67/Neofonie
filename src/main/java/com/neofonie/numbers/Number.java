package com.neofonie.numbers;

import com.neofonie.application.Logger;

/**
 * Convert an integer number to a string based on specific rules.
 * @author mohammad
 */
public class Number {
    public static final String fizz = "Fizz";
    public static final String buzz = "Buzz";
    public static final String fizzBuzz = "FizzBuzz";

    /**
     * Convert an integer number to string based on
     * For multiples of three print "Fizz" instead of the number
     * For the multiples of five print "Buzz"
     * For numbers which are multiples of both three and five print "FizzBuzz"
     *
     * @param number
     * @return  string of the number after applying rules.
     */
    public static String get(Integer number) {
        String result = number.toString();
        Logger.LogMethodStart(Number.class, result);

        //there is a possibility to use strategy pattern and composition pattern here.
        // if this code is going to be changed then this is a good practice to be done.
        if((number % 15) == 0) {
            result = fizzBuzz;
        }
        else if((number % 5) == 0) {
            result = buzz;
        }
        else if((number % 3) == 0) {
            result = fizz;
        }

        Logger.LogMethodStart(Number.class, result);
        return result;
    }
}
