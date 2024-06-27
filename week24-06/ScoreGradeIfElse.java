import java.util.Scanner;

public class ScoreGradeIfElse{

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter score : ");
  int score = scanner.nextInt();
  if(score >100 ){
  System.out.println("Invalid score input"); 
  }
  else if(score >=80){
  System.out.println("YOUR GRADE LETTER IS A");
  }
  else if(score>=70){
  System.out.println("YOUR GRADE LETTER IS B");
  }
  else if(score>=60){
  System.out.println("YOUR GRADE LETTER IS C");
  }
  else if(score>=50){
  System.out.println("YOUR GRADE LETTER IS D");
  }
  else {
  System.out.println("YOUR GRADE LETTER IS E");
  }
}
}