package runnable_tasks;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;
import static utils.CollectionUtils.sortStudentDetails;
import static utils.IOUtils.storeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class DoBSorterTask implements Runnable {

	private Map<String, Student> students;
	private String fileName;
	

	public DoBSorterTask(Map<String, Student> students, String fileName) {
		super();
		this.students = students;
		this.fileName = fileName;
	}


	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");// even
		try {
			//sort student details as per DoB
		//	sortStudentDetails(students,(s1,s2) -> s1.getDob().compareTo(s2.getDob()));
			List<Student> list = sortStudentDetails(students,Comparator.comparing(Student::getDob));
			//store sorted details in a file
			storeData(fileName, list);
			System.out.println("sorted student details as per DoB");
			
		} catch (Exception e) {
			System.out.println(currentThread().getName() + "got err " + e);
		}
		System.out.println(currentThread().getName() + " over");


	}

}
