import java.util.Scanner;
public class PalindromeRelaxed
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 10
// Relaxed palindrome

// variables

String str;
int strLength, j;
boolean palindrome = true;

// Intro and user input request

System.out.println("***\tDay 3, Exercise 10 \t***");
System.out.println("***\tPALINDROME REDUX \t***");
System.out.println();
System.out.println("This program will read a string and test to see if");
System.out.println("it is a relaxed palindrome, i.e. ignoring punctuation.");
System.out.println("Please enter a string at the prompt below.");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();

strLength = str.length();	//	get length
j = strLength-1;	//	get end of string index

// loop to middle of string

for (int i = 0 ; i < (int)(strLength / 2) ; i++) {
	
	// if character is not letter, skip i iteration
	
	if (Character.isLetter(str.charAt(i))) {
		
		// if character is not letter, skip j iteration
		
		if (Character.isLetter(str.charAt(j))) {

			//println(i + " , " + j);
			//println("Top: " + str.charAt(i) + ". Bottom: " + str.charAt(j));
			
			if ((char)Character.toLowerCase(str.charAt(i)) == (char)Character.toLowerCase(str.charAt(j))) {
				
			} else {
				palindrome = false;	//	if characters do not match
			}
			
			j--;
		
		} else {
		
			j--;	//	move j
			i--;	//	reset i iteration
			
			//println(str.charAt(j+1) + " is not a letter " + j);
		
		}
	
	} else {
		//println(str.charAt(i) + " is not a letter " + i);
	};

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

