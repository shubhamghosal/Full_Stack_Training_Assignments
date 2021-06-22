// 8. Write a java program to convert temperature from celsius to fahrenheit, get input from command line ?
// 	Hint : F = (9*C/5) + 32

public class CelciusFarenheit {

	public static void main(String[] args) {
		double c= Double.parseDouble(args[0]);
		double fa = c*9/5 + 32;
        
		System.out.println("Temperature of " +c +" degrees converted to farenheit is " +fa);

	}

}