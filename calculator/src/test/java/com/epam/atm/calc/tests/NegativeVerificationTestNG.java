package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeVerificationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForIsNegativeTest")
    public void isNegativeTest(long a, boolean expectedValue) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of Is Negative verification");
    }

    @DataProvider(name = "valuesForIsNegativeTest")
    public Object[][] valuesForIsNegative() {
        return new Object[][]{
                {1, false},
                {-1, true},
                {0, false},
        };
    }
}
