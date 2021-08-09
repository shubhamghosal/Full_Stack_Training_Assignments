package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.pojos.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	//dependency
	@Autowired
	private IEmployeeDao empDao;

	@Override
	public String hireEmployee(Employee emp, String deptname) {
		// B.L validations
		return empDao.hireEmployee(emp, deptname);
	}

}
