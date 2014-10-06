import java.util.Scanner;
public class Multiplication
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int i = 0, x, y, z = 0;
String str;

System.out.println("Enter two numbers.");
System.out.print("1: ");
str = System.console().readLine();
x = Integer.parseInt(str);
System.out.print("2: ");
str = System.console().readLine();
y = Integer.parseInt(str);

while (i < x) {
    i++;
    z += y;
}

System.out.println("The product of " + x + " and " + y + " is " + z);
}}

