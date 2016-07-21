package com.neofonie_test.number;

import com.neofonie.numbers.Number;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by mohammad on 7/21/2016.
 */
public class NumbersTest {
    @Test
    public void testValidArguments() {
        String[][] list = {{"1", "1"},  //start and end are equal
                {"1", "2"},  //start is less than end
                {"1", "3"},
                {"-10", "1"}, //negative start
                {"-20", "-1"}, //negative start and end
                {"0", "3"},  //start is zero
                {"-20", "0"} //end is zero
        }; //start is zero
        for(String[] args : list) {
            NumbersAdapter numbersAdapter = NumbersAdapter.create(args);
            numbersAdapter.print();
        }
    }

    @Test
    public void testInvalidArguments() {
        String[][] list = {
                {"qqq", "fgd"}, //start and end are invalid number
                {"qwe", "2"}, //start is invalid
                {"1", "qwe"}, //end is invalid
                {"1q", "1"}, //start ends with non number
                {"-20", "1q"}, //end ends with non number
                {"q1", "3"},  //start begin with a umber
                {"1", "3q"} //end ends with a number
        };
        for(String[] args : list) {
            NumbersAdapter numbersAdapter = NumbersAdapter.create(args);
            numbersAdapter.print();
        }
    }

    @Test
    public void testInvalidRangeArguments() {
        String[][] list = {
                {"20", "1"}, //start is grater than end
                {"20", "0"}, //start is grater than end and end is zero
                {"-20", "-30"}, //start is grater than end and both are negative
                {"1", "-20"} //start is grater than end and end is negative
        };
        for(String[] args : list) {
            NumbersAdapter numbersAdapter = NumbersAdapter.create(args);
            numbersAdapter.print();
        }
    }



}
