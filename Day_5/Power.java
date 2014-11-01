import java.util.Scanner;
public class Power
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 5
// Power function using recursion!

// variables

String str;
int base, exponent;

// Intro and user input request

System.out.println("***\tDay 5, Exercise 5 \t\t***");
System.out.println("***\tPOWER	\t\t\t***");
System.out.println();
System.out.println("This program will calculate the power of a base number");
System.out.println("to an exponent, using recursion or iteration. Please");
System.out.println("enter the base and exponent, and then choose a method");
System.out.println("at the prompts below.");
System.out.println();
System.out.print("BASE >> ");
str = System.console().readLine();	// receive user input for command
base = Integer.parseInt(str);
System.out.println();
System.out.print("EXPONENT >> ");
str = System.console().readLine();	// receive user input for command
exponent = Integer.parseInt(str);
System.out.println();

// command options

System.out.println("Command List:");
System.out.println("1.\t- Iteratively");
System.out.println("2.\t- Recursively");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input for command

// create power object

PowerObj p = new PowerObj(base, exponent);

// switch on input

switch (str) {
	case "1": 	System.out.println("Power using iteration: " + p.powerByIteration(p.base, p.exponent));
				break;
				
	case "2":	System.out.println("Power using recursion: " + p.powerByRecusion(p.base, p.exponent));
				break;
				
	default:	System.out.println("Invalid selection");
				break;
}

System.out.println();
System.out.println("End of Program");

// classes

}}

class PowerObj {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}

	int base;
	int exponent;
	
	PowerObj (int base, int exponent) {
	
		this.base = base;
		this.exponent = exponent;

	}
	
	static public int powerByRecusion(int b, int e) {
	
		System.out.println("Recursion");
		
		if ( e == 0 ) {
			return 1;
		} else {
			return b * powerByRecusion(b, e-1);
		}
		
	}
	
	static public int powerByIteration(int b, int e) {
	
		System.out.println("Iteration");
		
		int count = b;
		
		for(int i = 1 ; i < e ; i++) {
			
			count = count * b;
		
		}
		
		return count;
	
	}

}
