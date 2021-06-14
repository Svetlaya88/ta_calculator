package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSumCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForSumTest", groups = "prod")
    public void longSumTest(long a, long b, long expectedValue){
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10, 23, 33},
                {-10, -1, -11},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }
}
