import java.util.Scanner;
public class Division
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 6
// Divide two integers without using the modulus
// or division operation

// variables

int i = 0, x, y, z;
String str;

// Intro and user input request

System.out.println("***\tDay 1, Exercise 6 \t\t***");
System.out.println("***\tDIVISION	\t\t***");
System.out.println();
System.out.println("This program will divide none positive integer by another");
System.out.println("and output the result as quotient and remainder. The division");
System.out.println("and modulus operators cannot be used. Instead the control loop");
System.out.println("'while' will be used. Please enter two numbers at the prompts");
System.out.println("given below.");
System.out.println();
System.out.print(">> 1: ");
str = System.console().readLine();	// receive user input 1
x = Integer.parseInt(str);
System.out.print(">> 2: ");
str = System.console().readLine();	// receive user input 1
y = Integer.parseInt(str);

// subtract y from x until y is smaller and output quotient.

z = x;	// save x in z

while(z >= y) {

    i++;
    z -= y;

}

System.out.println(y + " goes " + i + " times into " + x + " remainder " + z);
System.out.println();
System.out.println("End of Program");
}}

