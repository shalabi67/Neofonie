package com.neofonie.com.neofonie.output;

/**
 * Created by mohammad on 7/21/2016.
 */
public final class  ConsoleOutput extends Output {
    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
