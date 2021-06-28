import java.util.Scanner;

public class PatternCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of rows to print: ");

		int row = in.nextInt();

		System.out.println("The Pattern is as follows:");

		for (int i = row; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		in.close();
	}

}
