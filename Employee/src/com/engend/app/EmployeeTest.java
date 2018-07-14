package com.engend.app;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Roman Cracker", 375000, 1990, 12, 15);
		staff[1] = new Employee("Timur Hacker ", 175000, 1995, 8, 25);
		staff[2] = new Employee("Artem Admin  ", 205000, 1994, 2, 5);
		
		for(Employee e : staff) {
			e.raiseSalary(50);
			System.out.println("Name = " + e.getName() + " | salary = " + e.getSalary() + " | hireDay = " + e.getHireDay());

		}
		
	}
}
