// 1. Write a java program to swap two numbers stored in local variables?

// Code:

import java.util.Scanner;  
public class SwapV {  
    public static void main(String[] args) {  
       int num1, num2, t; 
       Scanner sc = new Scanner(System.in);  
       System.out.print("Enter the two numbers to swap: ");  
       num1 = sc.nextInt();  
       num2 = sc.nextInt();  
       System.out.println("Before swapping numbers: "+num1 +" "+num2);  

       t = num1;  
       num1 = num2;  
       num2 = t;  
       System.out.println("After swapping: "+num1 +" " +num2);  
       sc.close();
    }    
}  