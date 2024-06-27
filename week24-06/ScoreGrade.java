import java.util.Scanner;

public class ScoreGrade{

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter score : ");
  int score = scanner.nextInt();
  if(score >100 ){
  System.out.println("Invalid score input"); 
  }
  if(score>=80 && score <=100){
  System.out.println("YOUR GRADE LETTER IS A");
  }
  if (score<=79 && score >=70 ){
   System.out.println("YOUR GRADE LETTER IS B");
  }
  if(score<=69 && score >=60){
  System.out.println("YOUR GRADE LETTER IS C");
  }
  if(score<=59 && score >=50){
  System.out.println("YOUR GRADE LETTER IS D");
  }
  if(score <=49 && score >=0){
  System.out.println("YOUR GRADE LETTER IS E");
  }
  
}

}