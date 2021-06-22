import java.util.Scanner;

class AvgCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the two double values: ");
        if ((in.hasNextDouble()) && (in.hasNextDouble())) {
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            if (num1 % 1 != 0 && num2 % 1 != 0) {
                System.out.println("The data type of the input is double.");
                System.out.println("The average of "+num1+" and "+num2+" is " + ((num1 + num2) / 2));
            } else
                System.out.println("Error: Invalid input data type");
        } else
            System.out.println("Error: Invalid input data type");
        in.close();
    }
}