package com.purbarun.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

@DisplayName("MathUtil Under Test")
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void createObjects() {
		mathUtils = new MathUtils();
	}

	@RepeatedTest(value = 3, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Addition Test")
	void test(RepetitionInfo repetitionInfo) {
		System.out.println(
				"Repetition: " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
		assertEquals(3, mathUtils.add(1, 2), "Addition Values should match");
	}

}
