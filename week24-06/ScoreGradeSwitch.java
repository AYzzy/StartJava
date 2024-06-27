import java.util.Scanner;

public class ScoreGradeSwitch{

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter score : ");
  int score = scanner.nextInt();
  switch(score/10){
  case 10:
     System.out.println("YOUR GRADE LETTER IS A");
     break;
  case 9:
     System.out.println("YOUR GRADE LETTER IS A");
     break;
  case 8: 
     System.out.println("YOUR GRADE LETTER IS A");
     break;
  case 7:
     System.out.println("YOUR GRADE LETTER IS B");
     break;
  case 6:
     System.out.println("YOUR GRADE LETTER IS C");
     break;
 case 5:
     System.out.println("YOUR GRADE LETTER IS D");
     break;
 case 4:
     System.out.println("YOUR GRADE LETTER IS E");
     break;
 case 3:
     System.out.println("YOUR GRADE LETTER IS E");
     break; 
 case 2:
     System.out.println("YOUR GRADE LETTER IS E");
     break;
 case 1:
     System.out.println("YOUR GRADE LETTER IS E");
     break;
     

}
}

}