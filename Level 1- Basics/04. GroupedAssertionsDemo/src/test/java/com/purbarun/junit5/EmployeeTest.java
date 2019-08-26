package com.purbarun.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Employee Under Test")
class EmployeeTest {

	private Employee employee;

	@BeforeEach
	void instantiateEmployee() {
		employee = new Employee();
		employee.setName("Vikas");
		employee.setPhone(9786765335L);
		employee.setCity("Kolkata");
	}

	@Test
	@DisplayName("Employee Object")
	void testEmployeeMembers() {
		assertAll("Employee", () -> assertEquals("Vikas", employee.getName(), "Name should Match"),
				() -> assertEquals(9786765335L, employee.getPhone(), "Phone should Match"),
				() -> assertEquals("Kolkata", employee.getCity(), "City should Match"));
	}
}
