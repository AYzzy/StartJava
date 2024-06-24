import java.util.Scanner;

public class RepeatSum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int num1 ;
int num2;
int num3;
do{
System.out.println("Enter first number: ");
num1 = input.nextInt();

System.out.println("Enter second number: ");
num2 = input.nextInt();

int total = num1 + num2;
System.out.println("The sum is : "+ total);

System.out.println("Enter any number to continue(enter 0 to stop): ");
num3 = input.nextInt();
}
while(num3 != 0);

}
}