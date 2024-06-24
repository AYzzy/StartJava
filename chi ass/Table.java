

public class Table{
public static void main(String[] args){

System.out.println("a  b  pow(a,b)");
int second;
double total = 0;
for(int i = 1; i <= 5; i++){
second=i+1;
total =Math.pow(i,second) ;
System.out.printf("%-2d %-2d %.1f%n",i,second,total);

}



}

}