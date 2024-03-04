package com.greglturnquist.payroll;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class employeeTests {
    /**
     * Test of Employee constructor, of class Employee.
     */
    @Test

    public void testEmployee() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;

        //Act
        Employee employee = new Employee(firstName, lastName, description, jobYears);

        //Assert
        assertNotNull(employee);
    }

    /**
     * Test of Employee getters, of class Employee.
     */
    @Test
    public void testEmployeeGetters() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;

        //Act
        Employee employee = new Employee(firstName, lastName, description, jobYears);

        //Assert
        assertEquals(firstName, employee.getFirstName());
        assertEquals(lastName, employee.getLastName());
        assertEquals(description, employee.getDescription());
        assertEquals(jobYears, employee.getJobYears());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when first name is null.
     */
    @Test
    public void testExceptionNullFirstName () {
        //Arrange
        String firstName = null;
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;

        String exceptionMessage = "First name cannot be null";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when first name is empty.
     */
    @Test
    public void testExceptionEmptyFirstName (){
        //Arrange
        String firstName = "";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;

        String exceptionMessage = "First name cannot be null";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * est of Employee if exception is thrown, of class Employee, when last name is null.
     */
    @Test
    public void testExceptionNullLastName () {
        //Arrange
        String firstName = "Frodo";
        String lastName = null;
        String description = "ring bearer";
        int jobYears = 4;

        String exceptionMessage = "Last name cannot be null";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when last name is empty.
     */
    @Test
    public void testExceptionEmptyLastName () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "";
        String description = "ring bearer";
        int jobYears = 4;

        String exceptionMessage = "Last name cannot be null";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when description is null.
     */
    @Test
    public void testExceptionNullDescription () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = null;
        int jobYears = 4;

        String exceptionMessage = "Description cannot be null";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when description is empty.
     */
    @Test
    public void testExceptionEmptyDescription () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "";
        int jobYears = 4;

        String exceptionMessage = "Description cannot be null";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when jobYears is lower than 0.
     */
    @Test
    public void testExceptionNullJobYearsLowerThanZero () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = -1;

        String exceptionMessage = "Job years cannot be negative";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }
}
