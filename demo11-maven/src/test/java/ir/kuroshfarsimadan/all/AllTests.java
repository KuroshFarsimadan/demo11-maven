package ir.kuroshfarsimadan.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ir.kuroshfarsimadan.calculator.CalculatorTest;
import ir.kuroshfarsimadan.clock.FinnishDateTimeClockTest;
import ir.kuroshfarsimadan.clock.InternetClockSourceTest;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, FinnishDateTimeClockTest.class, InternetClockSourceTest.class })
public class AllTests {
}