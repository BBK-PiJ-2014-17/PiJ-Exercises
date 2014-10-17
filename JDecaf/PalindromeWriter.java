import java.util.Scanner;
public class PalindromeWriter
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Read string and write as mirror image

String input, output = "";
int inputLength, j;

System.out.print("Please enter an input string: ");
input = System.console().readLine();

inputLength = input.length();

for (int i = (inputLength - 1) ; i >= 0 ; i--) {

	output = output + input.charAt(i);

}

System.out.println("Mirror image...");
System.out.println(input + output);
}}

