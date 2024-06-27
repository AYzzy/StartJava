import java.util.Scanner;

public class TotalAverage{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum =0;
   
    System.out.print("Enter a number : ");
    int num1 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num2 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num3 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num4 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num5 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num6 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num7 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num8 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num9 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num10 = scanner.nextInt();

    sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
    double average = sum/10;

    System.out.println("The total sum of numbers is: "+ sum);
    System.out.println("The total average of numbers is: "+ average);
}
}