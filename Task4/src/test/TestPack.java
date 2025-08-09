package test;
import mypackage.Calculator;

public class TestPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator calculator= new Calculator();
   int sum = calculator.add(5,4);
   int diff = calculator.sub(10,5);
    
   System.out.println("Sum = "+sum);
   System.out.println("diff = "+diff);
	}

}
