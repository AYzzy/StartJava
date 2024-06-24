import java.util.Scanner;

public class Power{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int num1 = input.nextInt();

System.out.println("Enter second number: ");
int num2 = input.nextInt();

double power = num1 ** num2;

System.out.println(num1+" raise to the power of "+ num2 + " is: "+ power);

}

}