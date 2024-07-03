import java.util.Scanner;
public class PhaseGate2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number : ");
int number = input.nextInt();

if( number % 3 ==0 || number % 5 == 0){
System.out.println(number + " is divisible by either 3 or 5.");
}

}

}