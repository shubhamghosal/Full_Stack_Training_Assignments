package p4;

public class Tester2 {

	public static void main(String[] args) {
		Printable p = new ConsolePrinter();
		System.out.println(p); //Interface does not extend from object class. 
		//But interface reference type var has direct access to all of the Object Class API
	}
}
