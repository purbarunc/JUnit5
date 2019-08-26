package com.purbarun.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.purbarun.junit5.MathUtils;

@DisplayName("MathUtils Class Under Test")
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void createObject() {
		mathUtils = new MathUtils();
	}

	@Test
	@DisplayName("Test for Sum")
	void addTest() {
		int actual = mathUtils.add(2, 3);
		assertEquals(5, actual, "Should return sum of two numbers");
	}

	@Test
	@DisplayName("Test for Multiplication")
	void mulTest() {
		assertEquals(8, mathUtils.mul(4, 2), "Should return sum of two numbers");
		assertEquals(10, mathUtils.mul(5, 2), "Should return sum of two numbers");
	}

	@Test
	@DisplayName("Test for Division")
	void divTest() {
		int actual = mathUtils.div(6, 3);
		assertEquals(2, actual, "Should return sum of two numbers");
	}
}
