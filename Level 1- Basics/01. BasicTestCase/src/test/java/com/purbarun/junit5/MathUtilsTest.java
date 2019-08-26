package com.purbarun.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("MathUtils Class Under Test")
class MathUtilsTest {

	MathUtils mathUtils;

	@Test
	@DisplayName("Test for Sum")
	void addTest() {
		mathUtils = new MathUtils();
		int actual = mathUtils.add(2, 3);
		assertEquals(5, actual, "Should return sum of two numbers");
	}
}
