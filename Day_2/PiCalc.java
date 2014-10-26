import java.util.Scanner;
public class PiCalc
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 2 - Exercise 18
// Calculate Pi using series approximation
// Request number of iterations

// variables

int k, n; // n = number of terms
double s = 0.0; // s = summation
String str;

// Intro and user input request

System.out.println("***\tDay 2, Exercise 18 \t\t***");
System.out.println("***\tPI	\t\t***");
System.out.println();
System.out.println("This program will approximate pi using series approximation");
System.out.println("to the number of terms requested in the input. Please specify");
System.out.println("a number of terms at the prompt below.");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input
n = Integer.parseInt(str);

// series approximation.

for (k = 0 ; k < n ; k++) {	//	sum
	
	s += (Math.pow((double)-1,(double)k) / ((2 * (double)k) + 1));
	
}

// display result

System.out.println(4.0 * s);

System.out.println();
System.out.println("End of Program");
}}

