package com.harshavardhan.assignment;

import com.harshavardhan.assignment.employees.Developer;
import com.harshavardhan.assignment.employees.Manager;
import com.harshavardhan.assignment.utilities.EmployeeUtilities; 
/**
 * Main class to demonstrate the usage of Employee, Manager, and Developer
classes.
 */ 

public class AssignmentMain {
	public static void main(String[] args) {

		
		 Manager manager = new Manager("Harsha", 101, 90000, "IT");
		 Developer developer = new Developer("sanya", 102, 80000, "Java");
		 // Using EmployeeUtilities to perform operations
		 
		 System.out.println("-------Manager-------- ");
		 EmployeeUtilities.displayEmployeeDetails(manager);
		 double managerAnnualSalary =	EmployeeUtilities.calculateAnnualSalary(manager);
		 System.out.println("Manager Annual Salary: " +	managerAnnualSalary);
		 
		 System.out.println();
		 System.out.println();
		 
		 System.out.println("-------Developer-------- ");
		 EmployeeUtilities.displayEmployeeDetails(developer);		
		 double developerAnnualSalary =	EmployeeUtilities.calculateAnnualSalary(developer);
		 System.out.println("Developer Annual Salary: " +
		developerAnnualSalary);
		 }
		} 


	