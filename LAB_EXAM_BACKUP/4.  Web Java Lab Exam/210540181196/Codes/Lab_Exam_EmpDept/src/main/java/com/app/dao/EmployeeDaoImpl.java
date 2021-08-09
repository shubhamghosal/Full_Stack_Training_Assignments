package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;
import com.app.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	//Dependency : CourseDao i/f
	@Autowired
	private IDepartmentDao deptDao;
	

	@Override
	public String hireEmployee(Employee emp, String deptname) {
		String mesg="Employee hiring failed!!!!";
		//get course details from course id
		Department dept=deptDao.getDepartmentDetails(deptname);
		if(dept != null)
		{
			//course : persistent
			dept.addEmployee(emp);//establish bi-dir relationship here.
			mesg="Employee "+emp.getName()+" hired in Department "+deptname;
		}
		return mesg;
	}

}
