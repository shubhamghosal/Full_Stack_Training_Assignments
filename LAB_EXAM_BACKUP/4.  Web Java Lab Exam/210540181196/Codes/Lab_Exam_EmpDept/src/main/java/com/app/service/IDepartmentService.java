package com.app.service;

import java.util.List;

import com.app.pojos.Department;

public interface IDepartmentService {
	List<String> getAllDepartmentName();
	
	//get course + enrolled student details (for course details page)
	Department getDepartmentDetails(String deptname);
}
