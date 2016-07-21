package com.neofonie.numbers;

import com.neofonie.application.Logger;
import com.neofonie.com.neofonie.output.ConsoleOutput;
import com.neofonie.com.neofonie.output.Output;

/**
 * allows the user to write a set of numbers. the default start number is 1 while the default end number is 100
 * @author mohammad
 * @version v1
 * @see Number
 */
public final class Numbers {
    private int start = 1;
    private int end = 100;

    private Output output;
    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    protected Numbers() {
        //create console output.
        output = Output.create(null);
    }

    /**
     * creates Numbers object
     * @param args  two integer numbers string the first number should be less than the second number.
     * if args is null or empty string then the strt will be 1 and end will be 100.
     * @return Numbers object or null if invalid parameters passed. if null is passed or emp
     */
    public static Numbers create(String[] args) {
        Logger.LogMethodStart(Numbers.class, Logger.getMethodName());
        try {
            if (args == null || args.length == 0)
                return new Numbers();
            Numbers number = new Numbers();
            try {
                if (args.length >= 1) {
                    number.start = Integer.parseInt(args[0]);
                }
                if (args.length >= 2) {
                    number.end = Integer.parseInt(args[1]);
                }
            } catch (NumberFormatException e) {
                Logger.LogException("Invalid parameters");
                return null;
            }

            if (number.start > number.end) {
                Logger.LogError("start " + number.start + " is greater than end " + number.end);
                return null;
            }

            //init output.
            String fileName = null;
            if (args.length >= 3) {
                fileName = args[2];
            }
            number.output = Output.create(fileName);

            return number;
        }
        finally { //make sure end method log will be logged
            Logger.LogMethodEnd(Numbers.class, Logger.getMethodName());
        }
    }

    /**
     * prints a Numbers from start to end, based on Number rules.
     * @see Number
     */
    public void print() {
        Logger.LogMethodStart(Numbers.class, Logger.getMethodName());

        for(int i=start;i<=end;i++) {
            output.write(Number.get(i));
        }

        Logger.LogMethodEnd(Numbers.class, Logger.getMethodName());
    }

    public int getStartNumber() {
        return start;
    }

    public int getEndNumber() {
        return end;
    }
}
