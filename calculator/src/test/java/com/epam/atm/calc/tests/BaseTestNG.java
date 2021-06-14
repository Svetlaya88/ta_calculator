package com.epam.atm.calc.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestNG {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        calculator = null;
    }
}
