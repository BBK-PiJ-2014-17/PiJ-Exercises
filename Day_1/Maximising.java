import java.util.Scanner;
public class Maximising
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 8
// Find the largest of a sequences of numbers

// variables

int i = 0, j = 0, max = 0;
String str;

System.out.println("***\tDay 1, Exercise 8 \t\t***");
System.out.println("***\tMAXIMISING	\t\t***");
System.out.println();
System.out.println("This program will read in a sequence of numbers terminated");
System.out.println("by a '-1', and then return the  largest of the entered");
System.out.println("numbers. Please enter the sequence of numbers at the prompt");
System.out.println("below.");
System.out.println();

// main loop

while (i != -1) {	// while input is not '-1', continue

    j++;
    
    System.out.print(">> " + j + ": ");
    str = System.console().readLine();	// receive user input
    i = Integer.parseInt(str);
    
    max = (max < i) ? i : max;	//	if input is greater than current largest
								// 	number, replace max with input.

}

System.out.println("The largest number entered was: " + max);
System.out.println();
System.out.println("End of Program");
}}

