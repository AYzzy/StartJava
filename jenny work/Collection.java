import java.util.Scanner;
public class Collection{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum =0;
int num=0;
int counter=1;


while(counter <= 10){
System.out.println("Enter numbers: ");
num = input.nextInt();
sum+=num;
counter++;
}

System.out.println("The total sum is "+sum);
}

}