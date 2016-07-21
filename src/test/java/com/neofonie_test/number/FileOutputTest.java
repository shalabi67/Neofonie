package com.neofonie_test.number;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by mohammad on 7/21/2016.
 */
public class FileOutputTest {

    @Test
    public void testValidArguments() throws IOException{
        String fileName = "a.txt";
        String[] args = {"1", "10", fileName};
        NumbersAdapter numbersAdapter = NumbersAdapter.create(args);
        numbersAdapter.print();

        StringOutput output = new StringOutput();
        numbersAdapter.numbers.setOutput(output);
        numbersAdapter.print();

        String actual = readFile(fileName);
        String expected = output.data;
        Assert.assertTrue(actual !=expected);


    }
    private String readFile(String fileName) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(fileName)));
        return contents;
    }
}
