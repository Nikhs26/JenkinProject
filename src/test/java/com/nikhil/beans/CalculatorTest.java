package com.nikhil.beans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc;
	@Before
	public void init() {
		calc =  new Calculator();
	}
	@After
	public void cleanup() {
		calc=null;
	}
	@Test
	public void testAdd() {
		int actual = calc.add(3, 5);
		int expected =  8;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int actual = calc.multiply(3, 5);
		int expected =  16;
		assertEquals(expected, actual);
	}

}
