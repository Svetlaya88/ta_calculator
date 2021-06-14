package com.epam.atm.calc.tests;

import org.junit.Assert;
import org.junit.Test;


public class LongDivByZeroTestNG extends BaseJUnit {

    @Test()
    public void positiveDivisionByZeroTest() {
        Assert.assertThrows(NumberFormatException.class, () -> calculator.div(10, 0));
    }

    @Test()
    public void negativeDivisionByZeroTest() {
        Assert.assertThrows(NumberFormatException.class, () -> calculator.div(-10, 0));
    }

    @Test()
    public void zeroDivisionByZeroTest() {
        Assert.assertThrows(NumberFormatException.class, () -> calculator.div(0, 0));
    }
}
