/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.unit;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;
import org.mule.modules.valomnia.entities.Employee;

public class EmployeeTest {

	@Test
	public void testSetterEmployeeReference_setsProperly() throws NoSuchFieldException, IllegalAccessException {

		Employee employee = new Employee();

		employee.setReference("test reference");

		final Field field = employee.getClass().getDeclaredField("reference");
		field.setAccessible(true);
		assertEquals(field.get(employee), "test reference");
	}

	@Test
	public void testSetterEmployeeFirstName_setsProperly() throws NoSuchFieldException, IllegalAccessException {
		Employee employee = new Employee();

		employee.setFirstName("test firstName");

		Field field = employee.getClass().getDeclaredField("firstName");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(employee), "test firstName");
	}

	@Test
	public void testGetterEmployeeReference_getsValue() throws NoSuchFieldException, IllegalAccessException {
		Employee employee = new Employee();

		Field field = employee.getClass().getDeclaredField("reference");
		field.setAccessible(true);
		field.set(employee, "test reference");

		final String result = employee.getReference();

		assertEquals("field wasn't retrieved properly", result, "test reference");
	}

	@Test
	public void testCEmployeesAreEqual() {

		Employee employee = new Employee();
		employee.setReference("test reference");
		employee.setFirstName("test first Name");
		employee.setLastName("test Last Name");
		employee.setMobile("987343");
		employee.setEmployeeGroupReference("employeeGroupReference");
		employee.setManagerReference("manager reference");

		assertEquals(employee.getFirstName(), "test first Name");
		assertEquals(employee.getLastName(), "test Last Name");
		assertEquals(employee.getMobile(), "987343");
		assertEquals(employee.getEmployeeGroupReference(), "employeeGroupReference");
		assertEquals(employee.getManagerReference(), "manager reference");

	}

}
