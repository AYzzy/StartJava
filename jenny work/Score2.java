import java.util.Scanner;
public class Score2{
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
System.out.printf("The total average of the number is %d", average);
}

}