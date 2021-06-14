package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveVerificationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForIsPositiveTest")
    public void isPositiveTest(long a, boolean expectedValue) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of Is Positive verification");
    }

    @DataProvider(name = "valuesForIsPositiveTest")
    public Object[][] valuesForIsPositive() {
        return new Object[][]{
                {1, true},
                {-1, false},
                {0, false},
        };
    }
}
