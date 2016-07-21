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
    static Integer maxTestNumber = Numbers.end;
    @Before
    public void testInit() {
        numberAdapter = new NumberAdapter();
    }
    @Test
    public void testFifteenMultiples() {
        positiveNumberTests(15, Number.fizzBuzz);
    }

    @Test
    public void testFifeMultiples() {
        positiveNumberTests(5, Number.buzz);
    }

    @Test
    public void testThreeMultiples() {
        positiveNumberTests(3, Number.fizz);
    }

    @Test
    public void testOtherNumbers() {
        for(Integer i=Numbers.start;i<maxTestNumber;i++) {
            if((i%15) == 0 || (i%5) == 0 || (i%3) == 0)
                continue;
            String result = numberAdapter.get(i);
            String expectedResult = i.toString();
            Assert.assertTrue("Expected " + expectedResult + " Actual "+ result, result.equals(expectedResult));
        }
    }


    private void positiveNumberTests(Integer increment, String expectedResult) {
        for(Integer i=increment;i<maxTestNumber;i += increment) {
            if((i%15) == 0)
                continue;
            String result = numberAdapter.get(i);
            Assert.assertTrue("Expected " + expectedResult+ " Actual "+ result, result.equals(expectedResult));
        }
    }



}
