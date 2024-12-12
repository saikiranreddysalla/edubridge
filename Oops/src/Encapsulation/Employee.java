package Encapsulation;

/*
 * DTO - Data Transfer Object
 * POJO-Plain Old Java Object
 * Model
 * Entity
 * Domain
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	//setter & getter  Methods

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}
