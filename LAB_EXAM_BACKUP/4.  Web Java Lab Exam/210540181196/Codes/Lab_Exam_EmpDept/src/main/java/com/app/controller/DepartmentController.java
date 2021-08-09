package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.IDepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private IDepartmentService deptService;

	public DepartmentController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	// add request method to list all courses
	@GetMapping("/list")
	public String listDepartment(Model map) {

		System.out.println("in list departments");
		map.addAttribute("dept_list", deptService.getAllDepartmentName());
		return "/departments/list";
	}

}
