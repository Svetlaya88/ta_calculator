package com.epam.atm.calc.tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseJUnit {

    protected static Calculator calculator;

    @BeforeClass
    public static void setup() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void teardown() {
        calculator = null;
    }
}
