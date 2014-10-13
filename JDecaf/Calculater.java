import java.util.Scanner;
public class Calculater
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Calculator

double x, y, z;
String str;

System.out.println("Please enter two numbers (doubles) on which to perform a");
System.out.println("selected operation.");

System.out.print("1st Number:");
str = System.console().readLine();
x = Double.parseDouble(str);

System.out.print("2nd Number:");
str = System.console().readLine();
y = Double.parseDouble(str);

System.out.println();
System.out.println("-- Operations menu --");
System.out.println("1: Addition.");
System.out.println("2: Subtraction.");
System.out.println("3: Multiplication.");
System.out.println("4: Division.");
System.out.println();

System.out.print("Please choose your operation:");
str = System.console().readLine();

switch (str) {
	case "1":	System.out.println("Addition");
				z = x + y;
				System.out.println("The result of " + x + " plus " + y + " is " + z);
				break;
	case "2":	System.out.println("Subtraction");
				z = x - y;
				System.out.println("The result of " + x + " minus " + y + " is " + z);
				break;
	case "3":	System.out.println("Multiplication");
				z = x * y;
				System.out.println("The result of " + x + " times " + y + " is " + z);
				break;
	case "4":	System.out.println("Division");
				z = (y==0) ? 0.0 : x / y;
				System.out.println("The result of " + x + " divided by " + y + " is " + z);
				break;
	default:	System.out.println("Non-valid selection");
				break;
}


}}

