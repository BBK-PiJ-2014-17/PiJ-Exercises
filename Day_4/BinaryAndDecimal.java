import java.util.Scanner;
public class BinaryAndDecimal
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 4
// Binary to Decimal methods

// variables

String str, b;
double d;

// Intro and user input request

System.out.println("***\tDay 4, Exercise 4 \t\t***");
System.out.println("***\tBINARY AND DECIMAL \t\t***");
System.out.println();
System.out.println("This program will convert a binary number into a decimal number");
System.out.println("and vice versa, using methods. Please choose a command from below.");

// command options

System.out.println("Command List:");
System.out.println("1.\t- Binary to Decimal");
System.out.println("2.\t- Decimal to Binary");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();

// switch on input

switch (str) {
	case "1": 	System.out.println("Enter Binary number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Decimal: " + binary2decimal(str));
				break;
				
	case "2": 	System.out.println("Enter Decimal number");
				System.out.print(">> ");
				str = System.console().readLine();
				d = Double.parseDouble(str);
				System.out.println("Binary: " + decimal2binary(d));
				break;
				
	default:	System.out.println("Invalid selection");
				break;
}

System.out.println();
System.out.println("End of Program");

// methods

} private static double binary2decimal(String b) {
	
	int power = 0, count = b.length() - 1;
	double d = 0.0;
	
	// from left to right, for each digit in the binary string,
	// sum the relevant powers of 2.
	
	for (int i = count; i >= 0 ; i--) {
		
		d += (Character.getNumericValue(b.charAt(i)) * Math.pow(2,power));
		power++;
	}

	return d;
}

static String decimal2binary(double d) {
	
	// integer part only...
	
	String s = "";
	int i = (int)d, r;
	
	// divide by 2 and append remainder to string.
	// repeat until 0
	
	while (i > 0) {
	
		r = i % 2;
		if (r == 1) i--;
		i = i / 2;
		s = r + s;
	
	}
	
	return s;
	
}	
	
	
	

}

