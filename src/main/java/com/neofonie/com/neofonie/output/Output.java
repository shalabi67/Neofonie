package com.neofonie.com.neofonie.output;

/**
 * abstract class to manage data writing.
 * @author mohammad
 */
public abstract class Output {
    /**
     * create an output subclass.
     * @param fileName if the file name is not null or empty it will be used to create a file output object.
     * @return output object or null
     * @see ConsoleOutput
     */
    public static Output create(String fileName) {
        if(fileName == null || fileName.length() == 0)
            return new ConsoleOutput();

        return null;
    }

    /**
     * write data to specific output device.
     * @param data
     */
    public abstract void write(String data);
}
