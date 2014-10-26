import java.util.Scanner;
public class CLCalculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 2
// Command-Line Calculator

// variables

int idx = -1;
double x = 0.0, y = 0.0, z = 0.0;
String input, op = "";

// Intro and user input request

System.out.println("***\tDay 3, Exercise 2 \t\t***");
System.out.println("***\tCOMMAND-LINE CALCULATOR	\t\t***");
System.out.println();
System.out.println("This program will ask for two numbers (doubles) and an operation.");
System.out.println("It will then perform that operation on the two numbers. Please");
System.out.println("enter two numbers (doubles) separated by an operation (+, -, *, /).");
System.out.println("For example, '3.6*4.5'");
System.out.print(">> ");
input = System.console().readLine();	//	receive user input

if (input.indexOf("+") > 0) {	//	check for addition operator

	idx = input.indexOf("+");
	
	x = Double.parseDouble(input.substring(0,idx));	//	first number
	y = Double.parseDouble(input.substring(idx+1,input.length()));	//	second number
	op = input.substring(idx,idx+1);

	System.out.println("Addition");
	z = x + y;
	System.out.println("The result of " + x + " plus " + y + " is " + z);	//	 result
	
} else if (input.indexOf("-") > 0) {	//	check for subtraction operator

	idx = input.indexOf("-");

	x = Double.parseDouble(input.substring(0,idx));	//	first number
	y = Double.parseDouble(input.substring(idx+1,input.length()));	//	second number
	op = input.substring(idx,idx+1);
	
	System.out.println("Subtraction");
	z = x - y;
	System.out.println("The result of " + x + " minus " + y + " is " + z);

} else if (input.indexOf("*") > 0) {	//	check for multiplication operator

	idx = input.indexOf("*");
	
	x = Double.parseDouble(input.substring(0,idx));	//	first number
	y = Double.parseDouble(input.substring(idx+1,input.length()));	//	second number
	op = input.substring(idx,idx+1);
	
	System.out.println("Multiplication");
	z = x * y;
	System.out.println("The result of " + x + " times " + y + " is " + z);

} else if (input.indexOf("/") > 0) {	//	check for division operator

	idx = input.indexOf("/");

	x = Double.parseDouble(input.substring(0,idx));	//	first number
	y = Double.parseDouble(input.substring(idx+1,input.length()));	//	second number
	op = input.substring(idx,idx+1);

	System.out.println("Division");
	z = (y==0) ? 0.0 : x / y;
	System.out.println("The result of " + x + " divided by " + y + " is " + z);
	
} else {

	System.out.println("Invalid operation string");	//	invalid input

}

System.out.println();
System.out.println("End of Program");
}}

