package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp_tbl")
public class Employee extends BaseEntity {
	@Column(length = 20)
	private String name;
	private String email;
	private double salary;
	@Column(name = "dob")
	private LocalDate dob;
	
	// many to one bi dir association
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id") 
	private Department selectedDepartment;

	public Employee() {
		System.out.println("in employee ctor");
	}

	public Employee(String name, String email, double salary, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Department getSelectedDepartment() {
		return selectedDepartment;
	}

	public void setSelectedDepartment(Department selectedDepartment) {
		this.selectedDepartment = selectedDepartment;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + ", dob=" + dob + "]";
	}

}
