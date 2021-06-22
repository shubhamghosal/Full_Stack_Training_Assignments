// 12. Write a java program to read temperature in centigrade and display a suitable message according to temperature state below :
// Temp < 0 then Freezing weather
// Temp 0-10 then Very Cold weather
// Temp 10-20 then Cold weather
// Temp 20-30 then Normal in Temp
// Temp 30-40 then Its Hot
// Temp >=40 then Its Very Hot

// Test Data :
// 42
// Expected Output :
// Its very hot.

// Code:

import java.util.Scanner;

public class Weather {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the temperature in centigrade : ");
    int temp = sc.nextInt();
    
    if(temp<0)
    {
    	System.out.println("Freezing weather.");
    }
    else if(temp>=0 && temp<10)
    {
    	System.out.println("Very Cold weather.");
    }
    else if(temp>=10 && temp<20)
    {
    	System.out.println("Cold weather.");
    }
    else if(temp>=20 && temp<30)
    {
    	System.out.println("Normal in Temp");
    }
    else if(temp>=30 && temp<40)
    {
    	System.out.println("Its Hot.");
    }
    else if(temp>=40)
    {
    	System.out.println("Its Very Hot.");
    }
    sc.close();
  }
}