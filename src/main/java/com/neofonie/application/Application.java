package com.neofonie.application;

import com.neofonie.numbers.Numbers;

/**
 * Created by mohammad on 7/21/2016.
 */
public class Application {
    public static void main(String args[]) {
        Logger.enableMethodLogging(true);
        Logger.LogMethodStart(Application.class, Logger.getMethodName());

        Numbers.print();

        Logger.LogMethodEnd(Application.class, Logger.getMethodName());
    }
}
