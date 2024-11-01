import java.util.Scanner;
public class IT24103900Lab3Q1A {
public static void main(String[]args)
{

//Define variables
double pricePerKg, weight, payment;

//create an object called input in scanner class
Scanner input=new Scanner(System.in);

//get user inputs.
System.out.print("Enter the price of 1kg of rice:");
pricePerKg=input.nextDouble();

System.out.print("Enter the number of kilograms you want to buy :");
weight=input.nextDouble();

//calculation
payment=pricePerKg*weight;
System.out.println("");

//display output
System.out.println("The total amount is:" +payment);

 }
}

