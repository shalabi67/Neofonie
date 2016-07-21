package com.neofonie.com.neofonie.output;

/**
 * write data to Console.
 * @author mohammad
 */
public final class  ConsoleOutput extends Output {
    @Override
    public boolean write(String data) {
        System.out.print(data);
        return true;
    }
}
