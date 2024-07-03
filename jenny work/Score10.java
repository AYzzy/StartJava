import java.util.Scanner;

public class Score10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int average = 0;
       int sum =0;
      int counter=0;

       for(int count =1; count <= 10; count ++){
      System.out.print("Enter a number : ");
       int number = input.nextInt();

      if(number <=100 && number >0){
      counter++;
     sum+=number;
     }
     average=sum/counter;
System.out.println("The total number of numbers between 100 is  "+ counter);
     }
System.out.println("The total sum of the number is  "+ sum);
System.out.println("The total average of the number is "+average);

}

}