package strings;

public class Test1 {

	public static void main(String[] args) {
		 String s1=new String("hello");
		s1.concat("hi");
		System.out.println(s1);//"hello"
		s1 += "12345";//s1 = s1+"12345"
		System.out.println(s1);//hello12345
		System.out.println(s1.toUpperCase());//u / l
		String s2=s1.replace('l', 't');
		System.out.println(s1);//orig
		System.out.println(s2);// replaced
		

	}

}
