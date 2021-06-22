package strings;

public class Test4 {

	public static void main(String[] args) {
		String s1="strings are easy strings!!!!!";
		System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
		System.out.println(s1.contains("are"));//t
		System.out.println(s1.indexOf("strings") +" "+s1.indexOf("string",10));//0 
		System.out.println(s1.lastIndexOf("string"));
		System.out.println("anish".compareTo("Anshu"));// -ve/+ve
		
		

	}

}
