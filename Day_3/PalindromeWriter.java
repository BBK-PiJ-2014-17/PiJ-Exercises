import java.util.Scanner;
public class PalindromeWriter
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 9
// Read string and write as mirror image

// variables

String input, output = "";
int inputLength, j;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 9 \t***");
System.out.println("***\tPALINDROME CREATOR \t***");
System.out.println();
System.out.println("This program will read a string and print out a");
System.out.println("palindrome by mirroring the input string. Please");
System.out.println("enter a string at the prompt below.");
System.out.println();
System.out.print(">> ");
input = System.console().readLine();	//	receive user input

inputLength = input.length();	//	get length

// loop backwards through input string and append letters to output string

for (int i = (inputLength - 1) ; i >= 0 ; i--) {

	output = output + input.charAt(i);

}

//display results

System.out.println("Mirror image...");
System.out.println();
System.out.println(input + output);

System.out.println();
System.out.println("End of Program");
}}

