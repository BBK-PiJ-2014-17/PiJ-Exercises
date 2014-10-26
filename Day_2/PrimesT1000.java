import java.util.Scanner;
public class PrimesT1000
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 2 - Exercise 13
// Output the first 1000 primes

// variables

boolean prime = true;
int i = 4, j = 1, count = 2; 	// start at 2 to account for first 2 primes
								// output before the main loop

System.out.println("***\tDay 2, Exercise 13 \t\t***");
System.out.println("***\tUP TO 1000 PRIMES	\t\t***");
System.out.println();
System.out.println("This program will display the first 100 prime numbers");
System.out.println("Press and key to continue...");
System.console().readLine();
System.out.println();

System.out.println("2");	//	first prime
System.out.println("3");	//	second prime

// main loop

while (count < 1000) { // while less than 1000 primes counted
	
	// test if i is prime.
	
	j = 1;
    	
    while (j < i/2) {
        j++;
    	if (i % j == 0) {	//	factor found
    	    prime = false;	//	number not prime
    	}
    }
	
    if (prime) {	// if prime found
        System.out.println(i);	// display
		count++;	// and add 1 to prime counter
    } else {
        //pass
    }
	
	prime = true;	// reset prime boolean for next number
	i++;	// increment number

}

System.out.println();
System.out.println("End of Program");
}}

