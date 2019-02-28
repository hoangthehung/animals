package com.hunghoang.animals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AbstractTest {
    ByteArrayOutputStream output;
    @BeforeEach
    void setUp() {
        initOutput();
    }
    void initOutput(){
        output = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(output);
        PrintStream old = System.out;
        System.setOut(ps);
    }

}