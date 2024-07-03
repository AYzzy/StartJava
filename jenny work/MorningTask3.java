import java.util.Scanner;
public class MorningTask3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int sum = 0;

for(int count =1; count <= 10; count ++){
System.out.print("Enter a number : ");
int number = input.nextInt();

if( count % 2 == 1)
continue;
sum+=number;
}
System.out.println("The sum of the even index  "+ sum);
}

}