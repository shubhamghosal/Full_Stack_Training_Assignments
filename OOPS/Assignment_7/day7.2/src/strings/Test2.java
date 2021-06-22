package strings;

public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = new String("HELLO");
		System.out.println(s1 == s2);// false (ref equality)
		System.out.println(s1.equals(s2)); // true (content equality : achieved via overriding form of the equals
											// method)
		System.out.println(s1 == s3);//false
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//String has : additional method : true

	}

}
