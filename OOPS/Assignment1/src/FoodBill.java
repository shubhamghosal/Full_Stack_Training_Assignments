import java.util.Scanner;

class FoodBill {
    public static void main(String[] args) {
        int n = 0, qty = 0, i = 1, bill = 0;
        Scanner sc = new Scanner(System.in);
        int[] price = { 30, 10, 20, 40, 150, 50, 45, 10, 80 };
        System.out.println("1. Dosa (Rs.30)");
        System.out.println("2. Samosa (Rs.10)");
        System.out.println("3. Vada Pav (Rs.20)");
        System.out.println("4. Idli (Rs.40)");
        System.out.println("5. Biriyani (Rs.150)");
        System.out.println("6. Roll (Rs.50)");
        System.out.println("7. Ice-cream (Rs.45)");
        System.out.println("8. Tea (Rs.10)");
        System.out.println("9. Coffee (Rs.80)");
        System.out.println("10. Generate Bill");
        System.out.println("Enter the item number and its quantity to order: ");
        while (true) {
            System.out.print("Order " + i + " : ");
            n = sc.nextInt();

            if (n == 10) {
                System.out.println();
                System.out.println("****** BILL ******");
                System.out.print("  Total: Rs." + bill);
                break;
            } else {
                qty = sc.nextInt();
                bill += qty * price[n - 1];
            }
            i++;
        }
        sc.close();
    }
}