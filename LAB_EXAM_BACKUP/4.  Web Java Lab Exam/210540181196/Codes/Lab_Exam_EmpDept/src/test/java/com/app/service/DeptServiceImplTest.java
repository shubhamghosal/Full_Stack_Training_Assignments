package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DeptServiceImplTest {
	@Autowired
	private IDepartmentService deptService;

	@Test
	void testGetAllCourseTitles() {
		List<String> titles = deptService.getAllDepartmentName();
		System.out.println(titles);
		assertEquals(1,titles.size());
		assertEquals("Spring Boot", titles.get(0));
	}

}
