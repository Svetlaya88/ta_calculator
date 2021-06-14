package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForTgTest")
    public void tgTest(double a, double expectedValue) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Incorrect result of tg operation");
    }

    @DataProvider(name = "valuesForTgTest")
    public Object[][] valuesForTg() {
        return new Object[][]{
                {1, 0.0174},
                {0, 0},
                {45, 1},
                {135, -1},
        };
    }
}
