public class Function{

	public static boolean isEven(int number){
	if (number % 2==0)return true;
	return false;
	}

	public static boolean isPrimeNumber(int number){
	int counter =0;
	for (int count=1;count<=number;count++){
	if (number % count ==0)
	counter++;
	}
	if(counter ==1)return true;
	return false;
	
	}

	public static int factorOf(int digit){
	int counter =0;
	for (int count=1;count<=digit;count++){
	if (digit % count ==0)
	counter++;
	}
	return counter;
	}

	public static int  subtract(int number1 , int number2){
	return number1- number2;
	}

	public static int divide (int number , int number2){
	return number / number2;
	}

	public static boolean isSquare(int digit){
	int count=0;
	for (count=1;count<=digit;count++){
	
	}
	if (digit % count ==0)return true;
	return false;
	}

	public static long factorialOf(int number){
	int multiple =1;
	int sum=0;
	for(int count =1;count<= number;count++){
	multiple *=count;
	
	}
	return multiple;
	}

	/**public static boolean isPalindrom(int number){
	if(int digit1 = number /10000 &&
        	int digit2 = (number % 10000) / 1000 &&
        	int digit3 = (number % 1000) / 100 &&
       	 int digit4 = (number % 100) /10 &&
        	int digit5 = number % 10)return true;
	return false;
	}**/

}