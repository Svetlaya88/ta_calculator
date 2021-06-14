package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongDivCalculationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForDivTest")
    public void longDivTest(long a, long b, long expectedValue) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of division operation");
    }

    @DataProvider(name = "valuesForDivTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {10, 2, 5},
                {-10, 2, -5},
                {-10, -2, 5},
        };
    }
}
