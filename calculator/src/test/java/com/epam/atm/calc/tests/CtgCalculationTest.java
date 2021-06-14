package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForCtgTest")
    public void tgTest(double a, double expectedValue) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of ctg operation");
    }

    @DataProvider(name = "valuesForCtgTest")
    public Object[][] valuesForCtg() {
        return new Object[][]{
                {45, 1},
                {0, 0},
                {45.5, 0.98269726311},
                {-45, -1},
        };
    }
}
