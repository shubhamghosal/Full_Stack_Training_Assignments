import java.util.Scanner;
public class UniqueArray {
	public static void main(String[] args) {
		int i,j;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements of the array: ");
		int num = in.nextInt();
		int arr[]=new int[num];
		System.out.print("Enter elements of the array: ");
		for(i=0; i<num; i++) {
			arr[i] = in.nextInt();
			}
		System.out.print("The unique elements of the array are: [");
	      for (i = 0; i < num; i++) {
	         for (j = 0; j < i; j++)
	         if (arr[i] == arr[j])
	            break;
	         if (i == j)
	         System.out.print(arr[i] +" ");
	      }
	      System.out.print("]");
	
		in.close();
	}
}
