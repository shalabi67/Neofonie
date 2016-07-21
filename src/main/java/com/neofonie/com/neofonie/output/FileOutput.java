package com.neofonie.com.neofonie.output;

import com.neofonie.application.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * write data to file
 * @author mohammad
 */
public class FileOutput extends Output {
    FileWriter fileWriter;

    /**
     * create fileOutput object to write data to a file.
     * @param fileName
     * @throws IOException
     */
    protected FileOutput(String fileName) throws IOException {
        Logger.LogMethodStart(FileOutput.class, Logger.getMethodName());
        try {
            File file = new File(fileName);
            fileWriter = new FileWriter(file);
        }
        finally {
            Logger.LogMethodEnd(FileOutput.class, Logger.getMethodName());
        }
    }

    @Override
    public boolean write(String data)  {
        Logger.LogMethodStart(FileOutput.class, Logger.getMethodName());
        try {
            fileWriter.write(data);
            fileWriter.flush();
            return true;
        }
        catch(IOException e) {
            Logger.LogException("Could not write data to file " + e.getMessage());
            return false;
        }
        finally {
            Logger.LogMethodEnd(FileOutput.class, Logger.getMethodName());
        }
    }

    @Override
    public void close() {
        Logger.LogMethodStart(FileOutput.class, Logger.getMethodName());
        try {
            fileWriter.close();
            return;
        }
        catch(IOException e) {
            Logger.LogException("Could not close file " + e.getMessage());
            return;
        }
        finally {
            Logger.LogMethodEnd(FileOutput.class, Logger.getMethodName());
        }
    }
}
