package com.neofonie.application;

import com.neofonie.numbers.Numbers;

/**
 * Created by mohammad on 7/21/2016.
 */
public class Application {
    public static void main(String args[]) {
        Logger.LogMethodStart(Application.class, Logger.getMethodName());

        Numbers numbers = Numbers.create(args);
        if(numbers == null) {
            System.out.println("Invalid arguments expecting two integer numbers separated by space. for example: 1  100");
            return;
        }
        numbers.print();

        Logger.LogMethodEnd(Application.class, Logger.getMethodName());
    }
}
