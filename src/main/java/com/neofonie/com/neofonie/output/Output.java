package com.neofonie.com.neofonie.output;

/**
 * Created by mohammad on 7/21/2016.
 */
public abstract class Output {
    public static Output create(String fileName) {
        if(fileName == null || fileName.length() == 0)
            return new ConsoleOutput();

        return null;
    }
    public abstract void write(String data);
}
