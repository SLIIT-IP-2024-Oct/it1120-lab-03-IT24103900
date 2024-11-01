import java.util.Scanner;
public class IT24103900Lab3Q2 {
public static void main(String[]args)
{

//Define variables 
double monSalary,otHours,otHourlyRate,totalSalary;

//create an object called input in scanner class
Scanner input=new Scanner(System.in);

//get monthly salary,number of OT hours and OT hourly rate as user inputs.
System.out.print("Enter the monthly salary:");
monSalary=input.nextDouble();

System.out.println("Enter the number of OT hours:");
otHours=input.nextDouble();

System.out.println("Enter the OT hourly rate:");
otHourlyRate=input.nextDouble();

//calculation
totalSalary=monSalary+(otHours*otHourlyRate);

//display total salary including OT
System.out.println("the total salary including OT is:" +totalSalary);
}
}