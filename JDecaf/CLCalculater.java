import java.util.Scanner;
public class CLCalculater
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Command-Line Calculator

int idx = -1;
double x = 0.0, y = 0.0, z = 0.0;
String input, op = "";

System.out.println("Please enter two numbers with an operation to be performed, using of the the");
System.out.println("following operations: +, -, *, /");

System.out.print("Operation:");
input = System.console().readLine();

if (input.indexOf("+") > 0) {

	idx = input.indexOf("+");
	
	x = Double.parseDouble(input.substring(0,idx));
	y = Double.parseDouble(input.substring(idx+1,input.length()));
	op = input.substring(idx,idx+1);

	System.out.println("Addition");
	z = x + y;
	System.out.println("The result of " + x + " plus " + y + " is " + z);
	
} else if (input.indexOf("-") > 0) {

	idx = input.indexOf("-");

	x = Double.parseDouble(input.substring(0,idx));
	y = Double.parseDouble(input.substring(idx+1,input.length()));
	op = input.substring(idx,idx+1);
	
	System.out.println("Subtraction");
	z = x - y;
	System.out.println("The result of " + x + " minus " + y + " is " + z);

} else if (input.indexOf("*") > 0) {

	idx = input.indexOf("*");
	
	x = Double.parseDouble(input.substring(0,idx));
	y = Double.parseDouble(input.substring(idx+1,input.length()));
	op = input.substring(idx,idx+1);
	
	System.out.println("Multiplication");
	z = x * y;
	System.out.println("The result of " + x + " times " + y + " is " + z);

} else if (input.indexOf("/") > 0) {

	idx = input.indexOf("/");

	x = Double.parseDouble(input.substring(0,idx));
	y = Double.parseDouble(input.substring(idx+1,input.length()));
	op = input.substring(idx,idx+1);

	System.out.println("Division");
	z = (y==0) ? 0.0 : x / y;
	System.out.println("The result of " + x + " divided by " + y + " is " + z);
	
} else {

	System.out.println("Invalid operation string");

}
}}

