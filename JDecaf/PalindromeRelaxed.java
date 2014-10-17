import java.util.Scanner;
public class PalindromeRelaxed
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Relaxed palindrome

String str;
int strLength, j;
boolean palindrome = true;

System.out.print("Please enter an input string: ");
str = System.console().readLine();

strLength = str.length();
j = strLength-1;


for (int i = 0 ; i < (int)(strLength / 2) ; i++) {
	
	//boolean skip = false;
	
	//j = (strLength - 1) - i;
	
	if (Character.isLetter(str.charAt(i))) {
	
		if (Character.isLetter(str.charAt(j))) {

			System.out.println(i + " , " + j);
			System.out.println("Top: " + str.charAt(i) + ". Bottom: " + str.charAt(j));
			
			if ((char)Character.toLowerCase(str.charAt(i)) == (char)Character.toLowerCase(str.charAt(j))) {
				
			} else {
				palindrome = false;
			}
			
			j--;
		
		} else {
		
			j--;
			i--;
			
			System.out.println(str.charAt(j+1) + " is not a letter " + j);
		
		}
	
	} else {System.out.println(str.charAt(i) + " is not a letter " + i);};

}

System.out.println(str + " is a palindrome = " + palindrome);
}}

