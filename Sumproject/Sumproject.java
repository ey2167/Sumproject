


/*Elohe Yonas CSC200

 * create variables for the 5 numbers
 * give functions to the variable
 *  
 * prompt user for 5 numbers;
 * printout sum 
 * printout average
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Sumproject {

public static void main(String[]args)
		{
	int num1, num2, num3, num4, num5, sum, average;
	
	Scanner keyboard = new Scanner(System.in);
	
	
	
	System.out.println ("type 5 numbers");
	num1= keyboard.nextInt();
	num2= keyboard.nextInt();
	num3= keyboard.nextInt();
	num4= keyboard.nextInt();
	num5= keyboard.nextInt();
	
	sum = num1 + num2 + num3 + num4 + num5;
	
	System.out.println ("the sum is" + sum);
	
	average = sum/5;
	System.out.println ("the average is" + average);

}
}