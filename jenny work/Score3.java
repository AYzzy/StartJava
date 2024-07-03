import java.util.Scanner;
public class Score3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int sum = 0;
int  average=0;
for(int count =1; count <= 10; count ++){
System.out.print("Enter a number : ");
int number = input.nextInt();
sum+=number;
average=sum/10;

}
System.out.println("The total sum of number is "+ sum);
System.out.printf("The total average of the number is %d", average);
}

}