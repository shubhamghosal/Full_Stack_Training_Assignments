package com.app.dao;

import java.util.List;

import com.app.pojos.Department;

public interface IDepartmentDao {
	List<String> getAllDepartment();

	// get ONLY dept details
	Department getDepartmentDetails(String deptname);

}
