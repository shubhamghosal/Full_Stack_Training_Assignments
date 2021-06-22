// 8. Write a java program to read roll no, name and marks of three subjects and calculate the total and percentage. 

// Test Data :
// Input the Roll Number of the student :784
// Input the Name of the Student :James
// Input the marks of Physics, Chemistry and Computer Application : 70 80 90

// Expected Output :
// Roll No : 784
// Name of Student : James
// Marks in Physics : 70
// Marks in Chemistry : 80
// Marks in Computer Application : 90
// Total Marks = 240
// Percentage = 80.00

import java.util.Scanner;

public class CalcPercent {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Input the Roll Number of the student : ");
    int roll = sc.nextInt();
    
    sc.nextLine();
    System.out.print("Input the Name of the Student :");
    String name = sc.nextLine();

    System.out.print("Input the marks of Physics, Chemistry and Computer Application :");
    int phy = sc.nextInt();
    int chem = sc.nextInt();
    int comp = sc.nextInt();
    int total = phy + chem + comp;
    double percent = total/3;


    System.out.println("Expected Output: ");
    System.out.println("Roll No : " +roll);
    System.out.println("Name of Student: " +name);
    System.out.println("Marks in Physics: " +phy +"\n"+"Marks in Chemistry :"+chem +"\n" +"Marks in Computer Application :"+comp);
    System.out.println("Total Marks = "+total);
    System.out.println("Percentage = "+percent +"%");
    sc.close();
  }
}