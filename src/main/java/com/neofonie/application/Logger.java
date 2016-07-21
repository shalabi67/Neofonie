package com.neofonie.application;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

/**
 * Created by mshalabi on 3/10/2016.
 */
public class Logger {
    protected java.util.logging.Logger logger = null;

    private static Logger loging = null;

    public static boolean Debug = false;

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
    private static void LogMethod(Class name, String message,  String status)
    {
        if(!Debug)
            return;
        Logger.create().logInfo(name.getName()  +  "::" +
                        getMethodName()+ status + message);
    }
    private static String getMethodName() {
        return Thread.currentThread().getStackTrace()[5].getMethodName();
    }
    public static void LogMethodStart(Class name, String message) {
        LogMethod(name, message, " start ");
    }
    public static void LogMethodEnd(Class name, String message) {
        LogMethod(name, message, " end ");
    }
    public static void LogMethodStart(Class name) {
        LogMethodStart(name, "");
    }
    public static void LogMethodEnd(Class name) {
        LogMethodEnd(name, "");
    }

}
