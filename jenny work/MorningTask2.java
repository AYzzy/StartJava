import java.util.Scanner;
public class MorningTask2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int sum = 0;

for(int count =1; count <= 10; count ++){
System.out.print("Enter a number : ");
int number = input.nextInt();

if( count % 2 == 1)
sum+=number;

}
System.out.println("The total sum of number is "+ sum);
}

}