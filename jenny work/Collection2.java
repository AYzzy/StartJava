import java.util.Scanner;
public class Collection2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum =0;
int count =0;
int num=0;

do{
	sum+=num;
	System.out.println("Enter numbers: ");
	 num = input.nextInt();

}while(num != -1);
	
System.out.println("The total sum is "+sum );

}

}