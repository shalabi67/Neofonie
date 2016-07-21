package com.neofonie.numbers;

import com.neofonie.application.Logger;

/**
 * allows the user to write a set of numbers.
 * @author mohammad
 * @version v1
 * @see Number
 */
public class Numbers {
    public static final int start = 1;
    public static final int end = 100;
    /**
     * prints a Numbers from start to end, based on Number rules.
     * @see Number
     */
    public static void print() {
        Logger.LogMethodStart(Numbers.class);

        for(int i=start;i<=end;i++) {
            System.out.println(Number.get(i));
        }

        Logger.LogMethodEnd(Numbers.class);
    }
}
