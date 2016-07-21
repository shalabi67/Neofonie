package com.neofonie_test.number;

import com.neofonie.numbers.Numbers;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by mohammad on 7/21/2016.
 */
public class NumbersAdapter {
    Numbers numbers = null;
    public static NumbersAdapter create(String args[]) {
        NumbersAdapter adapter = new NumbersAdapter();
        adapter.numbers = Numbers.create(args);
        return adapter;
    }

    public void print() {
        numbers.print();
    }
}
