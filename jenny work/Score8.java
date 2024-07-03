import java.util.Scanner;
public class Score8{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int sum = 0;

for(int count =1; count <= 10; count ++){
System.out.print("Enter a number : ");
int number = input.nextInt();

if(number <=100){
sum+=number;
}else {
System.out.println("invalid input");
}

}
System.out.println("The total sum of the number is  "+ sum);

}

}