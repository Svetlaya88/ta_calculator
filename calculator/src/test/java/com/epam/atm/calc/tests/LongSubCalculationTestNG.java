package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSubCalculationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForSubTest", groups = "prod")
    public void longSubTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of subtraction operation");
    }

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10, 3, 7},
                {10, 11, -1},
                {0, 0, 0},
                {-1, -10, 9}
        };
    }
}
