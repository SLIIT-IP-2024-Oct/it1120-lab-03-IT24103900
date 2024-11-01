import java.util.Scanner;
public class IT24103900Lab3Q4{
public static void main(String[]args)
{

//Define variables
int noOf10000,noOf1000,noOf100,noOf10,noOf1,number;

//create an object called input in scanner class
Scanner input=new Scanner(System.in);

//get number as user input.
System.out.print("Enter a five-digit number:");
number=input.nextInt();


//calculations
noOf10000=number/10000;
number=number%10000;

noOf1000=number/1000;
number=number%1000;

noOf100=number/100;
number=number%100;

noOf10=number/10;
noOf1=number%10;


//display output
System.out.print(" " +noOf10000);
System.out.print(" " +noOf1000);
System.out.print(" " +noOf100);
System.out.print(" " +noOf10);
System.out.print(" " +noOf1);
}
}