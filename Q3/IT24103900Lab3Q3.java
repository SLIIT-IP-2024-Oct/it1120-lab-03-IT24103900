import java.util.Scanner;
public class IT24103900Lab3Q3{
public static void main(String[]args)
{

//Define variables
int noOf5000,noOf1000,noOf500,noOf100,noOf50,noOf20,noOf10,noOf5,noOf2,noOf1,amount;

//create an object called input in scanner class
Scanner input=new Scanner(System.in);

//get rupee amount as user input.
System.out.print("Enter the rupee amount:");
amount=input.nextInt();


//calculations
noOf5000=amount/5000;
amount=amount%5000;

noOf1000=amount/1000;
amount=amount%1000;

noOf500=amount/500;
amount=amount%500;

noOf100=amount/100;
amount=amount%100;

noOf50=amount/50;
amount=amount%50;

noOf20=amount/20;
amount=amount%20;

noOf10=amount/10;
amount=amount%10;

noOf5=amount/5;
amount=amount%5;

noOf2=amount/2;
amount=amount%2;

noOf1=amount/1;

//display output
System.out.println("5000 Notes -" +noOf5000);
System.out.println("1000 Notes -" +noOf1000);
System.out.println("500 Notes -" +noOf500);
System.out.println("100 Notes -" +noOf100);
System.out.println("50 Notes -" +noOf50);
System.out.println("20 Notes -" +noOf20);
System.out.println("10 Coins -" +noOf10);
System.out.println("05 Coins -" +noOf5);
System.out.println("02 Coins -" +noOf2);
System.out.println("01 Coins -" +noOf1);

}
}