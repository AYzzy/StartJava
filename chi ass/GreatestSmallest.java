import java.util.Scanner;

public class GreatestSmallest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number = 0;
int minimum =0;
int maximum = 0;
while(number != -1){
System.out.println("Enter a number: ");
number = input.nextInt();
if(number != -1){
if(number < minimum ){
minimum = number;
}if(number > maximum){
maximum  = number;
}
}
}
System.out.println("The largest number is: " + maximum );

System.out.println("The smallest number is: " + minimum );



}

} 