import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
	int sum =0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int numbers = scanner.nextInt();
	    sum +=numbers;
        }
	System.out.println("The total sum :" +sum);

        //System.out.println("You entered the following numbers:");
        //for (int num : numbers) {
          //  System.out.print(num + " ");
        //}
    }
}
