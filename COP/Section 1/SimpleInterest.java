/*7. Write a java program to calculate simple interest, get the required inputs from command line ?
   Hint : SimpleInterest = (principal * rate * years)/100.0*/

public class SimpleInterest {

	public static void main(String[] args) {
		int p= Integer.parseInt(args[0]);
		int r= Integer.parseInt(args[1]);
		int t= Integer.parseInt(args[2]);
		double si = (p*r*t)/100;
        
		System.out.println("The simple interest is "+si);
	}

}