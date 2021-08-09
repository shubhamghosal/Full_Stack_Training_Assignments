package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "dept_tbl")
public class Department extends BaseEntity {
	@Column(length = 20)
	private String deptname;
	@Column(length = 20)
	private String location;
	@Column(length = 20)
	private int strength;
	@OneToMany(mappedBy = "selectedDepartment", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employee> emps = new ArrayList<>();

	public Department() {
		System.out.println("in department ctor");
	}


	public Department(String deptname, String location, int strength) {
		super();
		this.deptname = deptname;
		this.location = location;
		this.strength = strength;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public List<Employee> getEmployees() {
		return emps;
	}

	public void setEmployees(List<Employee> emps) {
		this.emps = emps;
	}
	//add helper methods
		public void addEmployee(Employee emp)
		{
			//parent --> child
			emps.add(emp);
			//child --> parent
			emp.setSelectedDepartment(this);		
		}

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", location=" + location + ", strength=" + strength + "]";
	}



	
}
