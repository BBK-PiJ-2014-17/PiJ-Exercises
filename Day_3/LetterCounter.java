import java.util.Scanner;
public class LetterCounter
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 5
// Count a chosen letter in the input string.

// variables

String str;
char countToken;
int len, i = 0, count = 0;
boolean b = true;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 5 \t\t***");
System.out.println("***\tCOUNTING LETTERS	\t***");
System.out.println();
System.out.println("This program will read in a string and then count");
System.out.println("the number of occurrences of a given letter. Please");
System.out.println("enter a string and a letter to search for at the prompts");
System.out.println("below.");
System.out.print(">> ");
str = System.console().readLine();	// receive user input string
System.out.print(">> Letter: ");
countToken = System.console().readLine().charAt(0);	// get letter to search for

// count occurrences

for (i = 0 ; i < str.length() ; i++) {	//	loop through string

	char c = str.charAt(i);
	
	if (c == countToken) {	// does letter equal the search term?
	
		count++;	// if yes, increment
	
	}

}

// display results

System.out.print("There are " + count + " " + countToken + "'s in");
System.out.println("\"" + str + "\"");

System.out.println();
System.out.println("End of Program");
}}

