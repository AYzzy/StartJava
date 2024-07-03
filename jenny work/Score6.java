import java.util.Scanner;
public class Score6{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int sum = 0;
int average=0;
int counter=0;

System.out.print("Enter a number : ");
int number = input.nextInt();
for(int count=1;count <10 ; count++){
System.out.print("Enter a number : ");
 number = input.nextInt();
if(number %2 ==0){
counter++;
sum+=number;
}
average = sum/counter;
}


System.out.println("The total average of the even number is  "+ average);

}

}