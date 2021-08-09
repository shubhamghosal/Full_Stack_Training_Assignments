package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDepartmentDao;
import com.app.pojos.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private IDepartmentDao courseDao;

	@Override
	public List<String> getAllDepartmentName() {
		// TODO Auto-generated method stub
		return courseDao.getAllDepartment();
	}

	@Override
	public Department getDepartmentDetails(String dept) {
		// TODO Auto-generated method stub
		return courseDao.getDepartmentDetails(dept);
	}

}
