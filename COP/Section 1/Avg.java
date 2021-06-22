/*6. Write a java program to take three numbers from command line and print the average ?
>> java Avg 5 6 4
Average=5*/

class Avg
{
public static void main(String args[])
{
double avg;
int a1= Integer.parseInt(args[0]);
int a2= Integer.parseInt(args[1]);
int a3= Integer.parseInt(args[2]);
avg=(a1+a2+a3)/3;
System.out.println("The average of the three numbers "+a1 +"," +a2 +","+a3 +" is "+avg);
}
}