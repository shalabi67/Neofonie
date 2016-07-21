package com.neofonie_test.number;

import com.neofonie.numbers.Number;

/**
 * Created by mohammad on 7/21/2016.
 * this class will encabsulate the Number class. in the case the dev code will change our test should not change
 */
public class NumberAdapter {
    public static final int defaultStart = 1;
    public static final int defaultEnd = 100;
    public String get(Integer num) {
        return Number.get(num);
    }

}
