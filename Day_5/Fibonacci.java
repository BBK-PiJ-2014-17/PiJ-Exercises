import java.util.Scanner;
public class Fibonacci
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 2.2b
// Fibonacci

// variables

String str;
public static int[] fibResults = new int[10]; //	array to memoize the fib calcs

// Intro and user input request

System.out.println("***\tDay 5, Exercise 2.2b \t***");
System.out.println("***\tFIBONACCI \t\t***");
System.out.println();
System.out.println("This program will print the Fibonacci sequence to a given number");
System.out.println("either iteratively or recursively, depending on the choice made.");
System.out.println("Please choose a command from below.");

// command options

System.out.println("Command List:");
System.out.println("1.\t- Iteratively");
System.out.println("2.\t- Recursively");
System.out.println("3.\t- Recursively with memoization");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input for command

// switch on input

switch (str) {
	case "1": 	System.out.println("Enter number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Fibonacci using iteration.");
				System.out.println(fibonacciIteration(Integer.parseInt(str)));
				break;
				
	case "2": 	System.out.println("Enter number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Fibonacci using recursion.");
				System.out.println(fibonacciRecursion(Integer.parseInt(str)));
				break;
				
	case "3": 	System.out.println("Enter number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Fibonacci using recursion.");
				fibResults = new int[Integer.parseInt(str)];	//	allocate for array
				System.out.println(fibonacciRecursionMemo(Integer.parseInt(str)));
				break;
				
	default:	System.out.println("Invalid selection");
				break;
}

System.out.println();
System.out.println("End of Program");

// methods

} private static int fibonacciIteration(int n) {
	
	int prev1 = 1;
	int prev2 = 1;
	int sum = 0;
	
	if (n == 1 || n == 2) {
		return 1;
	} else {
		
		for (int i = 2 ; i < n ; i++) {
		
			sum = prev1 + prev2;
			prev2 = prev1;
			prev1 = sum;

		}

	}

	return sum;
	
}

 private static int fibonacciRecursionMemo(int n) {
	
	// prepare fib array
		
	int result;
	
	if (n == 1 || n == 2) {
		return 1;
	} else {

		fibResults[0] = 1;
		fibResults[1] = 1;
		
		System.out.println("Fib 1: " + fibResults[0]);
		System.out.println("Fib 2: " + fibResults[1]);
	
		// check if fib results has already been calculated.
		
		if (fibResults[n-1] != 0) {
			
			System.out.println(n + " term already calc'd: " + fibResults[n-1]);
		
			result = fibResults[n-1];
			
		} else {
			
			System.out.println("Calculate fib for " + n);
			
			result = fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
			fibResults[n-1] = result;

		}
		
		for (int i : fibResults)
			System.out.println(i);
		
		return result;

	}
}

 private static int fibonacciRecursion(int n) {
	
	if (n == 1 || n == 2) {
		return 1;
	} else {
		int result = fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
		return result;
	}
}
}

