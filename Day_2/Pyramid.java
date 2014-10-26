import java.util.Scanner;
public class Pyramid
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 2 - Exercise 12
// Print a number pyramid

// variables

String str;
int i, j=0, k=0;

// Intro and user input request

System.out.println("***\tDay 2, Exercise 12 \t\t***");
System.out.println("***\tNUMBER PYRAMIDS	\t\t***");
System.out.println();
System.out.println("This program will display a pyramid of numbers up to");
System.out.println("the number entered at the prompt below.");
System.out.println();
System.out.print(">> ");
str = System.console().readLine(); // receive user input
i = Integer.parseInt(str);

// loop while number less than input

while (j < i) {

	j++;
	
	// for each number, loop to print copies of that number
	
	while (k < j) {
	
		k++;
		System.out.print(j);
	
	}

	System.out.println();
	k = 0;
	
}

System.out.println();
System.out.println("End of Program");
}}

