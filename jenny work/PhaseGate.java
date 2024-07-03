import java.util.Scanner;
public class PhaseGate{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number : ");
int number = input.nextInt();

if( number % 3 ==0 && number % 5 == 0){
System.out.println(number + " is divisible by 3 and 5.");
}else{
System.out.println(number + " isn't divisible by 3 and 5.");
}

}

}