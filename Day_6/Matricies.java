import java.util.Scanner;
public class Matricies
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 6 - Exercise 3
// Create matricies using Matrix class

// variables

Matrix m;

// Intro and user input request

System.out.println("***\tDay 6, Exercise 3 \t\t***");
System.out.println("***\tCREATING MATRICIES \t\t***");
System.out.println();
System.out.println("This program will create a matrix and then");
System.out.println("allow commands to be run on the matrix.");
System.out.println("Press any key to continue.");
System.console().readLine();	// receive user input for command
System.out.println();

m = new Matrix(3,3);

System.out.println("Matrix defined as:");
m.prettyPrint();
}}

