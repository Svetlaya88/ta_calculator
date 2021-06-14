package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForSinTest")
    public void sinTest(double a) {
        double result = calculator.sin(a);
        double expectedValue = Math.sin(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of sin operation");
    }

    @DataProvider(name = "valuesForSinTest")
    public Object[][] valuesForSin() {
        return new Object[][]{
                {1}, {0}, {45}, {135}, {-1}, {-45}, {45.5}
        };
    }
}
