import java.util.Scanner;
public class Factorial
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Factorial

String str;

System.out.print("Enter number: ");
str = System.console().readLine();
System.out.println("Factorial: " + factorialIteration(Integer.parseInt(str)));

} private static int factorialIteration(int n) {

	int count = 0;
	
	for (int i = 0 ; i < n ; i++) {
	
		System.out.println(i + " , " + n);
		count += n * (n-1);
		System.out.println(count);
		n--;
		
	}

	return count;
	
}

 private static int factorialRecursion(int n) {

	return 0;
	
}
}

