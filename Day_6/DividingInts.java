import java.util.Scanner;
public class DividingInts
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 6 - Exercise 1
// Script to call Calculator class

// variables

String str;
int x, y;

// Intro and user input request

System.out.println("***\tDay 6, Exercise 1 \t\t***");
System.out.println("***\tDIVIDING INTEGERS \t\t***");
System.out.println();
System.out.println("This program will perform a chosen mathematical operation");
System.out.println("on two given numbers by calling a class that contains the");
System.out.println("methods to calculate said operations. Please enter two");
System.out.println("numbers at the prompts below and then choose an operation.");
System.out.println();
System.out.print("X >> ");
str = System.console().readLine();	// receive user input for command
x = Integer.parseInt(str);
System.out.println();
System.out.print("Y >> ");
str = System.console().readLine();	// receive user input for command
y = Integer.parseInt(str);
System.out.println();

// command options

System.out.println("Command List:");
System.out.println("1.\t- Add");
System.out.println("2.\t- Subtract");
System.out.println("3.\t- Multiply");
System.out.println("4.\t- Divide");
System.out.println("5.\t- Modulus");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input for command

// create calculator object

Calculator c = new Calculator();

// switch on input

switch (str) {
	case "1": 	System.out.println("Add " + x + " to " + y + " gives " + c.add(x,y));
				break;
				
	case "2":	System.out.println("Subtract " + x + " from " + y + " gives " + c.subtract(x,y));
				break;
				
	case "3": 	System.out.println("Multiply " + x + " by " + y + " gives " + c.multiply(x,y));
				break;
				
	case "4":	System.out.println("Divide " + x + " by " + y + " gives " + c.divide(x,y));
				break;
				
	case "5":	System.out.println("Modulus of " + x + " by " + y + " gives " + c.modulus(x,y));
				break;
				
	default:	System.out.println("Invalid selection");
				break;
}

System.out.println();
System.out.println("End of Program");
}}

