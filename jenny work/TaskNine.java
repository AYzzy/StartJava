public class TaskNine{
public static void main(String[] args){

double sumTotal =0;
double sumTotal2=0; 
double finalTotal=0;
for (int i=0;i <=5 ; i++){
double total =Math.pow(4,i);
double total2 = Math.pow(8,i);
sumTotal += total;
sumTotal2 += total2;
finalTotal = sumTotal + sumTotal2;
double squareTotal = finalTotal *finalTotal;
//System.out.print(total+"  ");
//System.out.println(total2+" ");

//System.out.print("The total sum is 4 squares: "+ sumTotal);
//System.out.println("The total sum is 8 squares: "+ sumTotal2);
//System.out.println("The total sum of 4 square and 8 square: "+ finalTotal);
//System.out.println("The square of total of 4 square and 8 square: "+ squareTotal);

}
System.out.printf("The square of total of 4 square and 8 square: %.2f",squareTotal );

}
}