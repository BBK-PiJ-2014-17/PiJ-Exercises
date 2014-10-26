import java.util.Scanner;
public class Multiplication
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 5
// Multiply two integers without using the multiplication
// operator

// variables

int i = 0, x, y, z = 0;
String str;

// Intro and user input requests

System.out.println("***\tDay 1, Exercise 5 \t\t***");
System.out.println("***\tMULTIPLICATION	\t\t***");
System.out.println();
System.out.println("This program will multiply two positive integers");
System.out.println("without using the multiplication operator. Instead");
System.out.println("the control loop 'while' will be used. Please enter");
System.out.println("two numbers at the prompts given below.");
System.out.println();
System.out.print(">> 1: ");
str = System.console().readLine();	// receive user input 1
x = Integer.parseInt(str);
System.out.print(">> 2: ");
str = System.console().readLine();	// receive user input 2
y = Integer.parseInt(str);

// loop x times and add y to itself.

while (i < x) {
    i++;
    z += y;
}

System.out.println("The product of " + x + " and " + y + " is " + z);
System.out.println();
System.out.println("End of Program");
}}

