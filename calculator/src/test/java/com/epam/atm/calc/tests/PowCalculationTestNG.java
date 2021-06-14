package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalculationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForPowTest")
    public void powTest(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of pow operation");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {7, 2, 49},
                {0, 0, 1},
                {-7, 2, 49},
                {7, 0, 1},
                {0, 2, 0},
                {1.1, 2, 1.21},
                {-1.1, 2, -1.21},
        };
    }
}
