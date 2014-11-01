import java.util.Scanner;
public class Palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 4
// Detect a palindrome!
// Using Recursion

// variables

String str;
int strLength, j;
boolean palindrome = true;	// assume is palindrome, find contradiction.

// Intro and user input request

System.out.println("***\tDay 5, Exercise 4 \t\t***");
System.out.println("***\tPALINDROME	\t\t***");
System.out.println();
System.out.println("This program will read in a string and test to see if");
System.out.println("it is a palindrome, using recursion. Please enter a");
System.out.println("string at the prompt below.");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input

strLength = str.length();	// get string length
j = strLength-1;	//	end index for string characters

System.out.println(str + " is a palindrome : " + isPalindrome(str));

} private static boolean isPalindrome(String s) {

	System.out.println(s);
	System.out.println(s.length());
	
	if ( s.length() < 2 ) {
	
		System.out.println("String: " + s);
		return true;
	
	} else {
	
		String substring;
		substring = s.substring(1,s.length()-1);
	
		char first = s.charAt(0);
		char last = s.charAt(s.length()-1);
		
		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		
		if (first == last && isPalindrome(substring))
			return true;
	
	}
	
	return false;
}
}

