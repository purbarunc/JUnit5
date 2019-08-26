package com.purbarun.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("MathUtils Under Test")
@TestMethodOrder(OrderAnnotation.class)
class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeEach
	void createObject() {
		mathUtils = new MathUtils();
	}

	@Test
	@DisplayName("Addition Test")
	@Order(1)
	void addTest() {
		System.out.println("Executing 1st Test");
		int actual = mathUtils.add();
		assertEquals(6, actual, "Result should be sum");
	}

	@Test
	@DisplayName("Multiplication Test")
	@Order(2)
	void mulTest() {
		System.out.println("Executing 2nd Test");
		int actual = mathUtils.mul();
		assertEquals(24, actual, "Result should be product");
	}

	@Test
	@DisplayName("Division Test")
	@Order(3)
	void divTest() {
		System.out.println("Executing 3rd Test");
		int actual = mathUtils.div();
		assertEquals(4, actual, "Result should be division");
	}
}
