import java.util.Scanner;
public class Primes
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 4
// Receive input and determine if prime

// variables
int input;
boolean prime = true;

// Intro and user input request

System.out.println("***\tDay 1, Exercise 4 \t\t***");
System.out.println("***\tPRIME TEST	\t\t***");
System.out.println();
System.out.println("This program will test whether or not a positive integer");
System.out.println("is a prime number. Please enter a positive integer number");
System.out.println("at the prompt below.");
System.out.println();
System.out.print(">> ");
String str = System.console().readLine();
input = Integer.parseInt(str);
System.out.println();
System.out.print("Is " + input + " a prime number?");

// prime test

if (input == 1) {	// check if user input is 1, not prime.
    System.out.println("One is not a prime number, please pick a larger number.");
} else if (input > 1 && input < 4) {	// check if user input is 2 or 3, prime.
    System.out.println(input + " is prime.");
} else if (input > 3) {

    int i = 1;
    
	// loop through all  number up to half the value of the input and test if they
	// are a factor of the input, i.e. the input is divisible by that number with no
	// remainder.
	
    while (i < input/2) {
        i++;
    	if (input % i == 0) {
    	    prime = false;	// if example of division with no remainder found, number
							// not prime.
    	}
    }
    
	// print result based on findings.
	
    if (prime) {
        System.out.println(" Yes, " + input + " is prime.");
    } else {
        System.out.println(" No, " + input + " is not prime.");
    }
}

System.out.println();
System.out.println("End of Program");



}}

