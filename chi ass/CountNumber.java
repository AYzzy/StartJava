import java.util.Scanner;
public class CountNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number : ");
int number = input.nextInt();
int counter = 0;

for (int count=1;count<=number;count++){

if (number % count ==0){
counter++;
//System.out.println("The factors of "+number+" is " + count);
}

}
if(counter ==1)System.out.println(number+" is a prime number");
else {
System.out.println(number+" is not a prime number");
}
}

}