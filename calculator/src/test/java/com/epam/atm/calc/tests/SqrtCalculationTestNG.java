package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalculationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtTest(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of sqrt operation");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {16, 4},
                {0, 0},
                {4.84, 2.2},
                {-16, 4},
        };
    }
}
