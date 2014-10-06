import java.util.Scanner;
public class Primes
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Find if a given number is prime

int input;
boolean prime = true;

System.out.print("Enter a number: ");
String str = System.console().readLine();
input = Integer.parseInt(str);

System.out.println("Is the number prime?");
System.out.println(".......");

if (input == 1) {
    System.out.println("One is not a prime number, please pick a larger number.");
} else if (input > 1 && input < 4) {
    System.out.println(input + " is prime.");
} else if (input > 3) {

    int i = 1;
    
    while (i < input/2) {
        i++;
    	if (input % i == 0) {
    	    prime = false;
    	}
    }
    
    if (prime) {
        System.out.println(input + " IS prime");
    } else {
        System.out.println(input + " IS NOT prime");
    }
}




}}

