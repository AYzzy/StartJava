import java.util.Scanner;
public class Bank{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


String message ="""
	1. Transfer
	2. Airtime
	3. BuyData
	4. Share Data
		""";

System.out.println("Welcome To E-Banking App");
System.out.println(message);
//System.out.println("Press 2 to Airtime");
//System.out.println("Press 3 to Buy Data ");
//System.out.println("Press 4 to Share Data ");
//System.out.println("Press99 to Go Back");
//System.out.println(" ");

System.out.print("Enter any number: ");
int num = input.nextInt();

switch(num){
case 1:
	System.out.println("Transfer");
	break;
case 2: 
	System.out.println("Buy Airtime");
	break;
case 3:
	System.out.println("BuyData");
	break;
case 4:
	System.out.println("Share Data");
	break;
case 99:
	System.out.print("Go Back ");

default: 
	System.out.println("Invalid Input");

	}
	System.out.println("Thank you for banking with us");
}
}