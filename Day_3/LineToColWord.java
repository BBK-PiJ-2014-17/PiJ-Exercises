import java.util.Scanner;
public class LineToColWord
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 4
// // Read input string and write as column of words

// variables
 
String str;
int len, i = 0, idx;
boolean b = true;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 4 \t\t***");
System.out.println("***\tLINE TO COLUMN	\t\t***");
System.out.println();
System.out.println("This program will read in a sentence and then display");
System.out.println("the sentence as a column of words. Please enter a");
System.out.println("sentence at the prompt below.");
System.out.print(">> ");
str = System.console().readLine();	//	receive user input

len = str.length(); //	get text length

// main loop

while (b) {
	
	idx = str.indexOf(" "); // find space character
	
	if (idx == -1) {	// if no space, print remainder of input
		System.out.println(str);
		b = false;	//	break loop
		break;
	} else {
	
		System.out.println(str.substring(0, idx));
	
	}
	
	str = str.substring(idx + 1, str.length()); // modify string to remove words
												// printed so far.
	
}

System.out.println();
System.out.println("End of Program");
}}

