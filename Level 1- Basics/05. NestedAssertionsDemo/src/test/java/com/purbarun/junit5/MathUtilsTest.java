package com.purbarun.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("MathUtils Under Test")
class MathUtilsTest {

	MathUtils mathUtils;
	@BeforeEach
	void createInstance() {
		mathUtils = new MathUtils();
	}

	@Nested
	@DisplayName("Addition Test")
	class AddTest {
		@Test
		@DisplayName("Testing for positive(+) values")
		void testAddPositive() {
			assertEquals(3, mathUtils.add(1, 2), "Sum should Match");
		}

		@Test
		@DisplayName("Testing for negative(-) values")
		void testAddNegative() {
			assertEquals(-5, mathUtils.add(-2, -3), "Sum should Match");
		}
	}
	@Nested
	@DisplayName("Multiplication Test")
	class MulTest {
		@Test
		@DisplayName("Testing for positive(+) values")
		void testMulPositive() {
			assertEquals(6, mathUtils.mul(3, 2), "Sum should Match");
		}

		@Test
		@DisplayName("Testing for negative(-) values")
		void testMulNegative() {
			assertEquals(8, mathUtils.mul(-2, -4), "Sum should Match");
		}
	}

}
