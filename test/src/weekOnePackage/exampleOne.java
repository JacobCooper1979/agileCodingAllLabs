package weekOnePackage;

public class exampleOne {

	public static void main(String[] args) {
		// Creates a constant variable by using final this can not be changed later
		// all variables should be in camel case wich is costOfTheApple
		final double applePrice = 10.1;
		System.out.print("Hello World");
		System.out.println(" same line");
		System.out.print(" 5 + 7 = ");
		System.out.println(5 + 7);
		System.out.print(" the price of an apple is ");
		// this is a comment which is a single line comment
		System.out.println(applePrice);
		
		/*
		this 
		is a 
		multi line 
		comment
		*/
		// variable and reasignment 
		double x = 0;
		x = (30 * applePrice);
		System.out.print(" the price of 30 apple is ");
		System.out.println(x);
		
		// casting just place cracets infront of the variable you need to change
		System.out.print(" casting number = ");
		int number1 = 2;
		short number2 = (short) number1;
		System.out.println(number2);
		

		
		
		
		
	}

}
