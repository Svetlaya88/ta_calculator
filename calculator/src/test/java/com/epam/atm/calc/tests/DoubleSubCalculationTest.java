package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSubCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForSubTest", groups = "prod")
    public void doubleSubTest(double a, double b, double expectedValue) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of subtraction operation");
    }

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
        return new Object[][] {
                {10, 3.1, 6.9},
                {1, 5.2, -4.2},
                {0, 0, 0},
                {1.3, 1.1, 0.2}
        };
    }
}
