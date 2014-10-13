import java.util.Scanner;
public class LineToCol
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Read input and write as column

String str;
int len, i = 0;

System.out.print("Please enter an input string: ");
str = System.console().readLine();

len = str.length();

while (len > i) {
		
	System.out.println(str.substring(len - (len - i), len - (len - i - 1)));

	i++;
	
}
}}

