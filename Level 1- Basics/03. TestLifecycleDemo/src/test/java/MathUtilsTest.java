import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.purbarun.junit5.MathUtils;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("MathUtils Under Test")
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeAll
	void init() {
		System.out.println("MathUtils Test starting...");
	}

	@BeforeEach
	void createObject() {
		mathUtils = new MathUtils();
		System.out.println("object created...");
	}

	@Test
	@DisplayName("Test for Sum")
	void addTest() {
		int actual = mathUtils.add(2, 3);
		assertEquals(5, actual, "Should return sum of two numbers");
		System.out.println("Add Test Done...");
	}

	@Test
	@DisplayName("Test for Multiplication")
	void mulTest() {
		int actual = mathUtils.mul(4, 2);
		assertEquals(8, actual, "Should return sum of two numbers");
		System.out.println("Multiplication Test Done...");
	}

	@Test
	@DisplayName("Test for Division")
	void divTest() {
		int actual = mathUtils.div(6, 3);
		assertEquals(2, actual, "Should return sum of two numbers");
		System.out.println("Division Test Done...");
	}

	@AfterEach
	void endTest() {
		System.out.println("1 test ended...");
	}

	@AfterAll
	void end() {
		System.out.println("All tests ended");
	}

}
