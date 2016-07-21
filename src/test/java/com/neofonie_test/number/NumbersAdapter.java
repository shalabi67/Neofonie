package com.neofonie_test.number;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by mohammad on 7/21/2016.
 */
public class NumbersAdapter {
    private int start;
    private int end;
    public static NumbersAdapter create(String args[]) {
        NumbersAdapter adapter = new NumbersAdapter();

        return adapter;
    }

    public void print() {
        throw new NotImplementedException();
    }
}
