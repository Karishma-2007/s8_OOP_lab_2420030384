package oop1;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
         System.out.println("Enter your number");
         int n=sc.nextInt();
         int sum=0;
          while(n!=0) {
        	  int r=n%10;
        	  sum+=r;
        	  n=n/10;
          }
          System.out.print("the sum of digits of the given number is " +sum );
}
}