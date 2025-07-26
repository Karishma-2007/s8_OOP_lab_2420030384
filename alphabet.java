package oop1;
import java.util.Scanner;
public class alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// TODO Auto-generated method stub
        System.out.println("enter a character");
        char a=sc.next().charAt(0);
        
        if(a>='A' && a<='Z' || a>='a' && a<='z') {
        	System.out.println("char is an alphabet");
        }else {
        	System.out.println("char is not an alphabet");
        }
	}

}
