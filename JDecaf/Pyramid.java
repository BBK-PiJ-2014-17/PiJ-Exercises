import java.util.Scanner;
public class Pyramid
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Number Pyramid

String str;
int i, j=0, k=0;

System.out.println("Welcome to the Number Pyramid");
System.out.print("How many numbers are in the pyramid? Enter a positive number here: ");
str = System.console().readLine();
i = Integer.parseInt(str);

while (j < i) {

	j++;
	
	while (k < j) {
	
		k++;
		System.out.print(j);
	
	}

	System.out.println();
	k = 0;
	
}
}}

