package HashSet;

import java.util.HashSet;

public class TestHash {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<>();
		students.add(new Student("1","Shubham","sghosal@gmail.com"));
		students.add(new Student("2","Raghu","raghura@gmail.com"));
		students.add(new Student("3","Ravi","ravster@gmail.com"));
		System.out.println(students);
	}
}