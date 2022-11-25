package com.java.pojo;

import java.util.Objects;

public class Employee {

	private int empId;
	private String empName;
	private String countryName;
	private int age;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String countryName, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.countryName = countryName;
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", countryName=" + countryName + ", age=" + age
				+ "]";
	}
	
	
}
