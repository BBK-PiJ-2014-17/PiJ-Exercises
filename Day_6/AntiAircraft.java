import java.util.Scanner;
public class AntiAircraft
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 6 - Exercise 6
// Anti-aircraft aim game...

// variables

String str;
int x, y, z;
boolean b = true;

// Intro and user input request

System.out.println("***\tDay 6, Exercise 6 \t\t***");
System.out.println("***\tANTI-AIRCRAFT AIM	\t***");
System.out.println();

Target t = new Target(3);

t.displayTarget();

while (b) {

	System.out.println("Enter target address");
	System.out.println();
	System.out.print("X >> ");
	str = System.console().readLine();	// receive user input for command
	x = Integer.parseInt(str);
	System.out.println();
	System.out.print("Y >> ");
	str = System.console().readLine();	// receive user input for command
	y = Integer.parseInt(str);
	System.out.println();
	System.out.print("Z >> ");
	str = System.console().readLine();	// receive user input for command
	z = Integer.parseInt(str);
	System.out.println();
	
	t.fire(x - 1, y - 1, z - 1);
	
}

System.out.println();
System.out.println("End of Program");
}}

