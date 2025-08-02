package Lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
         
		System.out.println("enter the first string:");
		String str1 = sc.nextLine();
		
		System.out.println("enter the second string:");
		String str2 = sc.nextLine();
		
		str1=str1.toLowerCase().replaceAll("\\s"," ");
		str2=str2.toLowerCase().replaceAll("\\s"," ");
		 
		if(str1.length()!=str2.length()) {
			System.out.println("it is not an Anagram.");
		}else {
			char[] arr1= str1.toCharArray();
			char[] arr2= str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1,arr2)) {
				System.out.println("it is an Anagram");
			}else {
				System.out.println("not an Anagram");
			}
		}
		sc.close();
	}

}
