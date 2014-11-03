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
int rows, cols;
boolean b = true;
String str;

// Intro and user input request

System.out.println("***\tDay 6, Exercise 3 \t\t***");
System.out.println("***\tCREATING MATRICIES \t\t***");
System.out.println();
System.out.println("This program will create a matrix and then");
System.out.println("allow commands to be run on the matrix.");
System.out.println("Please use the following prompts to set the size");
System.out.println("of the matrix");
System.out.println();
System.out.print("Rows: ");
str = System.console().readLine();	// receive user input for command
rows = Integer.parseInt(str);
System.out.println();
System.out.print("Columns: ");
str = System.console().readLine();	// receive user input for command
cols = Integer.parseInt(str);
System.out.println();

m = new Matrix(rows, cols);

while (b) {
	
	String s = Integer.toString(displayCommands());
	int x, y, z;
	
	switch (s) {
		case "1": 	System.out.println("Set Element");
					System.out.println();
					System.out.print("Row: ");
					str = System.console().readLine();	// receive user input for command
					x = Integer.parseInt(str);
					System.out.println();
					System.out.print("Column: ");
					str = System.console().readLine();	// receive user input for command
					y = Integer.parseInt(str);
					System.out.println();
					System.out.print("Value: ");
					str = System.console().readLine();	// receive user input for command
					z = Integer.parseInt(str);
					System.out.println();
					
					m.setElement(x-1, y-1, z);
					
					break;
					
		case "2": 	System.out.println("Set Row");
					System.out.println();
					System.out.print("Row: ");
					str = System.console().readLine();	// receive user input for command
					x = Integer.parseInt(str);
					System.out.println();
					System.out.print("Values: ");
					str = System.console().readLine();	// receive user input for command
					System.out.println();
					
					m.setRow(x - 1, str);
					
					break;
					
		case "3": 	System.out.println("Set Column");
					System.out.println();
					System.out.print("Column: ");
					str = System.console().readLine();	// receive user input for command
					x = Integer.parseInt(str);
					System.out.println();
					System.out.print("Values: ");
					str = System.console().readLine();	// receive user input for command
					System.out.println();
					
					m.setColumn(x - 1, str);
					break;
					
		case "4": 	System.out.println("Display Matrix");
					m.prettyPrint();
					break;
					
		case "5": 	System.out.println("Exit");
					b = false;
					break;
					
		default:	System.out.println("Invalid selection");
					break;
	}
		
}

System.out.println();
System.out.println("End of Program");

// methods

} private static int displayCommands() {

	String str;
	
	System.out.println("Command List:");
	System.out.println("1.\t- Set Element");
	System.out.println("2.\t- Set Row");
	System.out.println("3.\t- Set Column");
	System.out.println("4.\t- Display Matrix");
	System.out.println("5.\t- Exit");

	System.out.println();
	System.out.print(">> ");
	str = System.console().readLine();	// receive user input for command

	return Integer.parseInt(str);
	
}

}

