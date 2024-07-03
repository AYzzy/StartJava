import java.util.Scanner;

public class Score9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       int sum =0;
      

       for(int count =1; count <= 10; count ++){
      System.out.print("Enter a number : ");
       int number = input.nextInt();

      if(number <=100 && number >0){
     sum+=number;
     }

}
System.out.println("The total sum of the number is  "+ sum);

}

}