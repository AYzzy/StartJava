import java.util.Scanner;
import java.util.Arrays;
public class Array2{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 System.out.print("Enter the size of array: ");
 int size = input.nextInt();
 int[] newArray= new int[size];

 for(int count=0;count<newArray.length;count++){
  System.out.println("Enter number: ");
  int numbers = input.nextInt();
  newArray[count] = numbers;
 
 }
 System.out.println(Arrays.toString(newArray));
}

}