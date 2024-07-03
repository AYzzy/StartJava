import java.util.Scanner;
public class Collection3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum =0;


for (int count = 1; count <= 5 ; count++){
	System.out.println("Enter numbers: ");
	 int num = input.nextInt();
	sum+=num;
	
}
	System.out.println("The total sum :"+sum);

}

}