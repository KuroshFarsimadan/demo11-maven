package ir.kuroshfarsimadan.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void testSumTheDefault() {
		Calculator calc = new Calculator();
		int result = calc.sum(3, 8);
		assertEquals(11, result);
	}

	@Test
	public void testSumZeros() {
		Calculator calc = new Calculator();
		int result = calc.sum(0, 0);
		assertEquals(0, result);
	}

	@Test
	public void testSumNegatives() {
		Calculator calc = new Calculator();
		int result = calc.sum(-5, -9);
		assertEquals(-14, result);
	}

	@Test
	public void testMultiplyDefault() {
		Calculator calc = new Calculator();
		int result = calc.multiply(4, 9);
		assertEquals(36, result);
	}

	@Test
	public void testMultiplyZeros() {
		Calculator calc = new Calculator();
		int result = calc.multiply(0, 98);
		assertEquals(0, result);
	}

	@Test
	public void testMultiplyNegatives() {
		Calculator calc = new Calculator();
		int result = calc.multiply(1, -1);
		assertEquals(-1, result);
	}
}
