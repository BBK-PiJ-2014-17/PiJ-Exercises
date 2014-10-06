import java.util.Scanner;
public class PiCalc
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Calculate Pi using series approximation

int k, n; // n = number of terms
double s = 0.0; // s = summation
String str;

System.out.println("Approximating Pi");
System.out.print("Enter how many terms for approximation: ");
str = System.console().readLine();
n = Integer.parseInt(str);

for (k = 0 ; k < n ; k++) {
	
	s += (Math.pow((double)-1,(double)k) / ((2 * (double)k) + 1));
	
}

System.out.println(4.0 * s);
}}

