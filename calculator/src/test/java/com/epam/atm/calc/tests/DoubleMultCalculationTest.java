package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleMultCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForMultTest", groups = "prod")
    public void doubleMultTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of multiplication operation");
    }

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][] {
                {10.1, 3, 30.3},
                {10.1, 0, 0},
                {-1.1, 0, 0},
                {-1.1, -1.2, 1.32},
                {-2, 2, -4}
        };
    }
}
