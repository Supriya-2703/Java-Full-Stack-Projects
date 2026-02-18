package Employee_Management_System;

abstract class Employee {
	abstract int CalculateSalary();
}

class FullTimeEmployee extends Employee {
	int CalculateSalary() {
		return 50000;
	}
}

class PartTimeEmployee extends Employee {
	int CalculateSalary() {
		return 20000;
	}
}

class EmployeeManagementSystem {
	public static void main(String args[]) {
		FullTimeEmployee fe = new FullTimeEmployee();
		PartTimeEmployee pe = new PartTimeEmployee();
		
		System.out.println("Full TIme Salary: " +fe.CalculateSalary());
		System.out.println("Part TIme Salary: " +pe.CalculateSalary());
		
	}
}