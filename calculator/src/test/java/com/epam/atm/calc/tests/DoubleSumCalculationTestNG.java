package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSumCalculationTestNG extends BaseTestNG {

    @Test(dataProvider = "valuesForSumTest", groups = "prod")
    public void doubleSumTest(double a, double b, double expectedValue){
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10.1, 23.2, 33.3},
                {-10, -1.1, -11.1},
                {0, 0, 0},
                {-1.1, 10, 8.9}
        };
    }
}

