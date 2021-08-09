package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;


@Repository
public class DepartmentDaoImpl implements IDepartmentDao {
	@Autowired
	private EntityManager manager;

	@Override
	public List<String> getAllDepartment() {
		String jpql = "select c.deptname from Department c";
		return manager.createQuery(jpql, String.class).getResultList();
	}

	@Override
	public Department getDepartmentDetails(String deptname) {
		String jpql = "select c from Department c where c.deptname=:deptname";
		return manager.createQuery(jpql, Department.class).setParameter("deptname", deptname).getSingleResult();
	} //rets ONLY course details

}
