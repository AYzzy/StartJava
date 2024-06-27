public class TaskSeven{
public static void main(String[] args){

double sumTotal =0;
double sumTotal2=0; 
for (int i=0;i <=5 ; i++){
double total =Math.pow(4,i);
double total2 = Math.pow(8,i);
sumTotal += total;
sumTotal2 += total2;
System.out.print(total+"  ");
System.out.println(total2+" ");

System.out.print("The total sum is: "+ sumTotal);
System.out.println("The total sum is: "+ sumTotal2);
}

}
}