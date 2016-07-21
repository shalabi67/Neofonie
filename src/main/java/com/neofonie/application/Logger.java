package com.neofonie.application;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

/**
 * Created by mshalabi on 3/10/2016.
 */
public class Logger {
    protected java.util.logging.Logger logger = null;

    private static Logger loging = null;

    public static Logger create()
    {
        if(loging == null)
        {
            Logger log = new Logger();
            log.logger = java.util.logging.Logger.getLogger(java.util.logging.Logger.GLOBAL_LOGGER_NAME);

            log.logger.setLevel(Level.INFO);

            loging = log;
        }
        return loging;
    }
    protected void addConsoleHandler()
    {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        logger.addHandler(handler);
    }

    protected void log(Level level, String message)
    {
        logger.log(level, message);
    }
    protected void logException(String message)
    {
        log(Level.SEVERE, message);
    }
    protected void logError(String message)
    {
        log(Level.SEVERE, message);
    }
    protected void logWarning(String message)
    {
        log(Level.WARNING, message);
    }
    protected void logInfo(String message)
    {
        log(Level.INFO, message);
    }

    public static void LogException(String message)
    {
        Logger.create().logException(message);
    }
    public static void LogError(String message)
    {
        Logger.create().logError(message);
    }
    public static void LogWarning(String message)
    {
        Logger.create().logWarning(message);
    }
    public static void LogInfo(String message)
    {
        Logger.create().logInfo(message);
    }

}
