import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE; 
        int maxNumber = Integer.MIN_VALUE; 

	int input ;
        do {
	    System.out.println("Enter numbers (enter -1 to stop):");
             input = scanner.nextInt();
            if (input != -1) {
                if (input < minNumber) {
                    minNumber = input;
                }
                if (input > maxNumber) {
                    maxNumber = input;
                }
            }
        } while (input != -1);

        System.out.println("The smallest number is: " + minNumber);
        System.out.println("The largest number is: " + maxNumber);
    }
}
