import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];

        for (int count = 0; count < newArray.length; count++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();
            newArray[count] = number;
        }

        System.out.println("Array elements:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
