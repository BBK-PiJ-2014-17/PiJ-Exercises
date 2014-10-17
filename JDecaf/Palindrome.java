import java.util.Scanner;
public class Palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Detect a palindrome!
// Loop from either end of a string and compare letters

String str;
int strLength, j;
boolean palindrome = true;

System.out.print("Please enter an input string: ");
str = System.console().readLine();

strLength = str.length();
j = strLength-1;

for (int i = 0 ; i < (int)(strLength / 2) ; i++) {
	
	j = (strLength - 1) - i;
	
	System.out.println(i + " , " + j);
	System.out.println("Top: " + str.charAt(i) + ". Bottom: " + str.charAt(j));
	
	if (str.charAt(i) == str.charAt(j)) {
		
	} else {
		palindrome = false;
	}
	
}

System.out.println(str + " is a palindrome = " + palindrome);


}}

