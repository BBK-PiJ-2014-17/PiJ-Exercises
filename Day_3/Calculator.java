import java.util.Scanner;
public class Calculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 1
// Calculator

// variables

double x, y, z;
String str;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 1 \t\t***");
System.out.println("***\tCALCULATOR	\t\t***");
System.out.println();
System.out.println("This program will ask for two numbers (doubles) and an operation.");
System.out.println("It will then perform that operation on the two numbers.");
System.out.println("Please enter two numbers (doubles) on which to perform a");
System.out.println("selected operation.");
System.out.println();
System.out.print(">> 1: ");
str = System.console().readLine();	// receive user input
x = Double.parseDouble(str);

System.out.print(">> 2: ");
str = System.console().readLine();	// receive user input
y = Double.parseDouble(str);

// display operations option menu.

System.out.println();
System.out.println("-- Operations menu --");
System.out.println("1: Addition.");
System.out.println("2: Subtraction.");
System.out.println("3: Multiplication.");
System.out.println("4: Division.");
System.out.println();
System.out.println("Please choose your operation.");
System.out.print(">> ");
str = System.console().readLine();	//	 receive user input

// switch based on input

switch (str) {
	case "1":	System.out.println("Addition");
				z = x + y;
				System.out.println("The result of " + x + " plus " + y + " is " + z);
				break;
	case "2":	System.out.println("Subtraction");
				z = x - y;
				System.out.println("The result of " + x + " minus " + y + " is " + z);
				break;
	case "3":	System.out.println("Multiplication");
				z = x * y;
				System.out.println("The result of " + x + " times " + y + " is " + z);
				break;
	case "4":	System.out.println("Division");
				z = (y==0) ? 0.0 : x / y;
				System.out.println("The result of " + x + " divided by " + y + " is " + z);
				break;
	default:	System.out.println("Non-valid selection");
				break;
}

System.out.println();
System.out.println("End of Program");
}}

