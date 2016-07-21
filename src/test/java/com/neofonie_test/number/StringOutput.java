package com.neofonie_test.number;

import com.neofonie.com.neofonie.output.Output;

/**
 * Created by mohammad on 7/21/2016.
 */
public final class StringOutput extends Output {
    String data = "";
    @Override
    public boolean write(String data) {
        this.data += data;
        return true;
    }
}
