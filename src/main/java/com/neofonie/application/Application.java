package com.neofonie.application;

import com.neofonie.numbers.Numbers;

/**
 * Created by mohammad on 7/21/2016.
 */
public class Application {
    public static void main(String args[]) {
        Logger.Debug = false;
        Logger.LogMethodStart(Application.class);

        Numbers.print();

        Logger.LogMethodEnd(Application.class);
    }
}
