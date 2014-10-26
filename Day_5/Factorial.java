import java.util.Scanner;
public class Factorial
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 2.1a
// Factorial

// variables

String str;

// Intro and user input request

System.out.println("***\tDay 5, Exercise 2.1a \t***");
System.out.println("***\tFACTORIAL \t\t***");
System.out.println();
System.out.println("This program will calculate the factorial of a given number");
System.out.println("either iteratively or recursively, depending on the choice made.");
System.out.println("Please choose a command from below.");

// command options

System.out.println("Command List:");
System.out.println("1.\t- Iteratively");
System.out.println("2.\t- Recursively");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input for command

// switch on input

switch (str) {
	case "1": 	System.out.println("Enter number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Factorial using iteration: " + factorialIteration(Integer.parseInt(str)));
				break;
				
	case "2": 	System.out.println("Enter number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Factorial using recursion: " + factorialRecursion(Integer.parseInt(str)));
				break;
				
	default:	System.out.println("Invalid selection");
				break;
}

System.out.println();
System.out.println("End of Program");

// methods

} private static int factorialIteration(int n) {

	int tempSum = n;	// set first value
	
	for (int i = 1 ; i < n ; i++) {	//	loop through all numbers for n to 0
	
		System.out.println(i + " , " + n);
		tempSum = tempSum * (n-i);	//	multiply by previous number and store product
		System.out.println(tempSum);
		//n--;	//	reduce n
		
	}

	return tempSum;
	
}

 private static int factorialRecursion(int n) {
	
	int result;
	
	if (n == 1) {
		return 1;
	} else {
		result = n * factorialRecursion(n-1);	//	recursive call to factorial
		return result;
	}

}
}

