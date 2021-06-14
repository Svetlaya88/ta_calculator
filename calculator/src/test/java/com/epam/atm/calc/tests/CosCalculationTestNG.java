package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalculationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForCosTest")
    public void cosTest(double a) {
        double result = calculator.cos(a);
        double expectedValue = Math.cos(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of cos operation");
    }

    @DataProvider(name = "valuesForCosTest")
    public Object[][] valuesForCos() {
        return new Object[][]{
                {1}, {0}, {45}, {135}, {-1}, {-45}, {45.5}
        };
    }
}
