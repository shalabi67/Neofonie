package com.neofonie_test.number;

import com.neofonie.numbers.Numbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.neofonie.numbers.Number;

/**
 * Created by mohammad on 7/21/2016.
 */
public class NumberTests {
    static NumberAdapter numberAdapter = null;

    @Before
    public void testInit() {
        numberAdapter = new NumberAdapter();
    }
    @Test
    public void testFifteenMultiples() {
        numberTests(15, Number.fizzBuzz);
    }

    @Test
    public void testFifeMultiples() {
        numberTests(5, Number.buzz);
    }

    @Test
    public void testThreeMultiples() {
        numberTests(3, Number.fizz);
    }

    @Test
    public void testOtherNumbers() {
        for(Integer i=NumberAdapter.defaultStart;i<NumberAdapter.defaultEnd;i++) {
            if((i%15) == 0 || (i%5) == 0 || (i%3) == 0)
                continue;
            String result = numberAdapter.get(i);
            String expectedResult = i.toString();
            Assert.assertTrue("Expected " + expectedResult + " Actual "+ result, result.equals(expectedResult));
        }
    }

    @Test
    public void testZeroNumbers() {
        String result = numberAdapter.get(0);
        Assert.assertTrue("Expected 0" + " Actual "+ result, result.equals("0"));
    }

    @Test
    public void testNullNumber() {
        String result = numberAdapter.get(null);
        Assert.assertTrue("Expected null", result == null);
    }

    private void numberTests(Integer increment, String expectedResult) {
        positiveNumberTests(increment, expectedResult);
        negativeNumberTests(increment, expectedResult);
    }
    private void positiveNumberTests(Integer increment, String expectedResult) {
        for(Integer i=increment;i<NumberAdapter.defaultEnd;i += increment) {
            if((i%15) == 0)
                continue;
            String result = numberAdapter.get(i);
            Assert.assertTrue("Expected " + expectedResult+ " Actual "+ result, result.equals(expectedResult));
        }
    }

    private void negativeNumberTests(Integer increment, String expectedResult) {
        for(Integer i=-increment;i>-NumberAdapter.defaultEnd;i -= increment) {
            if((i%15) == 0)
                continue;
            String result = numberAdapter.get(i);
            Assert.assertTrue("Expected " + expectedResult+ " Actual "+ result, result.equals(expectedResult));
        }
    }

}
