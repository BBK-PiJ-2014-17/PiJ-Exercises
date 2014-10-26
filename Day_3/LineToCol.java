import java.util.Scanner;
public class LineToCol
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 4
// Read input string and write as column of words

// variables

String str;
int len, i = 0;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 4 \t\t***");
System.out.println("***\tLINE TO COLUMN	\t\t***");
System.out.println();
System.out.println("This program will read in some text and then display");
System.out.println("the text as a column of letters. Please enter an");
System.out.println("input string at the prompt below.");
System.out.print(">> ");
str = System.console().readLine();	//	receive user input

len = str.length();	//	get text length

// main loop

while (len > i) {	//	while there are letters to print
	
	// use substring() to get current letter and display
	
	System.out.println(str.substring(len - (len - i), len - (len - i - 1)));

	i++;
	
}

System.out.println();
System.out.println("End of Program");
}}

