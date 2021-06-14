package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleDivByZeroTest extends BaseTestNG {

    @Test(groups = "prod", dataProvider = "divByZeroValues")
    public void divisionByZeroTest(double a, double b) {
        Assert.assertThrows(NumberFormatException.class, () -> calculator.div(a, b));
    }

    @DataProvider(name = "divByZeroValues")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {10.1, 0},
                {-10.1, 0},
                {0, 0},
        };
    }
}
