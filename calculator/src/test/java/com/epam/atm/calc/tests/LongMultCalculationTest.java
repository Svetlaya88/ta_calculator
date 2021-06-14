package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongMultCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForMultTest", groups = "prod")
    public void longMultTest(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of multiplication operation");
    }

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][] {
                {10, 3, 30},
                {10, 0, 0},
                {-1, 0, 0},
                {-1, -1, 1},
                {-2, 2, -4}
        };
    }
}
