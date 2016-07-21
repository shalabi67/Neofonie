package com.neofonie.application;

import com.neofonie.numbers.Numbers;

/**
 * Created by mohammad on 7/21/2016.
 */
public class Application {
    public static void main(String[] args) {
        Logger.LogMethodStart(Application.class, Logger.getMethodName());

        Numbers numbers = Numbers.create(args);
        if(numbers == null) {
            System.out.println("Invalid arguments expecting two integer numbers separated by space " +
                    "and a valid file name. for example: 1  100 a.txt. if the error continue see system log.");
            return;
        }
        numbers.print();

        Logger.LogMethodEnd(Application.class, Logger.getMethodName());
    }
}
