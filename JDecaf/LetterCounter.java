import java.util.Scanner;
public class LetterCounter
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// count the e's

String str;
char countToken;
int len, i = 0, count = 0;
boolean b = true;

System.out.print("Please enter an input string: ");
str = System.console().readLine();
System.out.print("Please select a letter to count in this sentence: ");
countToken = System.console().readLine().charAt(0);

for (i = 0 ; i < str.length() ; i++) {

	char c = str.charAt(i);
	
		System.out.println(c);
	
	if (c == countToken) {
	
		count++;
	
	}

}

System.out.println("There are " + count + " " + countToken + "'s in");
System.out.println("\"" + str + "\"");
}}

