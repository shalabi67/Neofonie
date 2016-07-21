package com.neofonie.com.neofonie.output;

import com.neofonie.application.Logger;

import java.io.IOException;

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
        Logger.LogMethodStart(Output.class, Logger.getMethodName());
        try {
            if (fileName == null || fileName.length() == 0)
                return new ConsoleOutput();

            return new FileOutput(fileName);
        }
        catch(IOException e) {
            Logger.LogException(e.getMessage());
            return null;
        }
        finally {  //make sure the end method log will be called
            Logger.LogMethodEnd(Output.class, Logger.getMethodName());
        }

    }

    public void close() {

    }

    /**
     * Write data to specific output device.
     * @param data
     * @return true if right successful.
     */
    public abstract boolean write(String data);
}
