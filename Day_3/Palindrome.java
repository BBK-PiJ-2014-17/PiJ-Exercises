import java.util.Scanner;
public class Palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 8
// Detect a palindrome!
// Loop from either end of a string and compare letters

// variables

String str;
int strLength, j;
boolean palindrome = true;	// assume is palindrome, find contradiction.

// Intro and user input request

System.out.println("***\tDay 3, Exercise 8 \t\t***");
System.out.println("***\tPALINDROME	\t\t***");
System.out.println();
System.out.println("This program will read in a string and test to see if");
System.out.println("it is a palindrome. Please enter a string at the");
System.out.println("prompt below.");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input

strLength = str.length();	// get string length
j = strLength-1;	//	end index for string characters

for (int i = 0 ; i < (int)(strLength / 2) ; i++) {	// loop to middle of string
	
	j = (strLength - 1) - i;	//	move towards middle from end of string
		
	if (str.charAt(i) == str.charAt(j)) {
		//pass
	} else {
		palindrome = false;	//	not a palindrome
	}
	
}

// display results
System.out.println();
if (palindrome) {
	System.out.println("'" + str + "' is a palindrome.");
} else {
	System.out.println("'" + str + "' is NOT a palindrome.");
}

System.out.println();
System.out.println("End of Program");


}}

