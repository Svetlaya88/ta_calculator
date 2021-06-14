package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleDivCalculationTest extends BaseTestNG {

    @Test(dataProvider = "valuesForDivTest")
    public void doubleDivTest(double a, double b, double expectedValue) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Incorrect result of division operation");
    }

    @DataProvider(name = "valuesForDivTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {10.2, 2, 5.1},
                {-10.2, 2, -5.1},
                {-10, 2.2, -4.545454545454545},
                {0, 2.1, 0},
                {0, 0, 0},
        };
    }
}
