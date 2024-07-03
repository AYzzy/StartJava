import java.util.Scanner;
public class Language{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Welcome! Welcome!! Welcome!!!");
System.out.println("Enter a number to select languuage");
int language = input.nextInt();

	System.out.println((language==1)?"English":"Hausa");


}

}