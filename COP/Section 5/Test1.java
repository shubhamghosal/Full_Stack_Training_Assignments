// 1. Create a class Emp with fields like empId, name,dept,salary,address.
//   Write required constructors for initialization
//   Write a method displayEmpDetails() in the same class.
  
//   Write another test class , where you have to take emp details from user using Scanner and create object and call methods.
// CODE:

import java.util.*;
class Test1{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	
    System.out.println("Enter Employee Id: ");
	int id = in.nextInt();
	
	in.nextLine();
	
	System.out.println("Enter Employee Name: ");
	String na = in.nextLine();
	
	System.out.println("Enter Department: ");
	String de = in.nextLine();
	
	System.out.println("Enter Salary: ");
	double sa = in.nextDouble();
	
	System.out.println("Enter Address: ");
	String ad = in.next();
	
	Emp e1 = new Emp(id, na, de, sa, ad);
	e1.displayEmpDetails();
    in.close();
    }

}

class Emp{
		int empId;
		String Name;
		String dept;
		double salary;
		String address;
		
		Emp(int i, String n, String d, double s, String a){
			empId = i;
			Name = n;
			dept = d;
			salary = s;
			address = a;
		}
		void displayEmpDetails(){
			System.out.println(empId + " " + Name  + " " + dept + " " + salary + " " + address);
		}
	
}