package com.epam.atm.calc;

import com.epam.atm.calc.listeners.TestListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListener());

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Collections.singletonList("./src/test/resources/testng.xml"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
