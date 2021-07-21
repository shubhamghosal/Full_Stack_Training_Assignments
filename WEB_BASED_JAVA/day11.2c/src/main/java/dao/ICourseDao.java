package dao;

import pojos.Course;

public interface ICourseDao {
//launch net course
	String addNewCourse(Course course);

	// cancel course
	String cancelCourse(int courseId);

	// get Course details
	Course getCourseDetails(String title);

	// get Course and student details
	Course getCourseStudentDetails(String title);
	
	Course getStudentDetailsJoinQuery(String title);
}
