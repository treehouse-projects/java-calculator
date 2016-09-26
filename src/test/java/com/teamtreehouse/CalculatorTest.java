package com.teamtreehouse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void addSumsCorrectly() throws Exception {
        int result = calc.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void subtractRemoves() throws Exception {
        int result = calc.subtract(3, 1);

        assertEquals(2, result);
    }

    @Test
    public void multiplyWorks() throws Exception {
        int result = calc.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    public void divisionWorks() throws Exception {
        int result = calc.divide(6, 2);

        assertEquals(3, result);
    }


}