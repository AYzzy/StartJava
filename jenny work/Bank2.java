import java.util.Scanner;
public class Bank2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int counter=1;
System.out.print("Enter number 1 to kick start: ");
int num = input.nextInt();

while(num != -1){

switch(num){
case 1:
	String message ="""
	1. Transfer
	2. Airtime
	3. BuyData
	4. Share Data
		""";
	System.out.print(message);
	System.out.print("Enter any number: ");
	int num1 = input.nextInt();

	switch(num1){
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
		break;
	default: 
	System.out.println("Invalid Input");
	}
	break;
default: 
	System.out.println("Invalid Input");


	}

	System.out.print("Enter any number to continue or -1 to end: ");
	num = input.nextInt();
	}

	System.out.println("Thank you for banking with us");
}
}