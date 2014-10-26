import java.util.Scanner;
public class DistanceP2P
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 12
// Read three points and calculate the closest two points

// variables

String str;
double dist1, dist2, dist3;
Point one = new Point();
Point two = new Point();
Point three = new Point();

// Intro and user input request

System.out.println("***\tDay 3, Exercise 12 \t\t\t***");
System.out.println("***\tDISTANCE POINT-TO-POINT	\t\t***");
System.out.println();
System.out.println("This program will read in 3 points and then check each distance");
System.out.println("to see which two are closest. Please enter three points at the");
System.out.println("prompts below.");
System.out.println();
System.out.print("First coordinate X: ");
str = System.console().readLine();	//	user input 1
one.x = Double.parseDouble(str);

System.out.print("First coordinate Y: ");
str = System.console().readLine();	//	user input 1
one.y = Double.parseDouble(str);

System.out.print("Second coordinate X: ");
str = System.console().readLine();	//	user input 2
two.x = Double.parseDouble(str);

System.out.print("Second coordinate Y: ");
str = System.console().readLine();	//	user input 2
two.y = Double.parseDouble(str);

System.out.print("Third coordinate X: ");
str = System.console().readLine();	//	user input 3
three.x = Double.parseDouble(str);

System.out.print("Third coordinate Y: ");
str = System.console().readLine();	//	user input 3
three.y = Double.parseDouble(str);

// calculate distances between each point

dist1 = Math.sqrt(Math.pow(one.x - two.x, 2.0) + Math.pow(one.y - two.y, 2.0));
dist2 = Math.sqrt(Math.pow(one.x - three.x, 2.0) + Math.pow(one.y - three.y, 2.0));
dist3 = Math.sqrt(Math.pow(two.x - three.x, 2.0) + Math.pow(two.y - three.y, 2.0));

//println(dist1);
//println(dist2);
//println(dist3);

// check which two points are closest and display result

if (dist1 < dist2) {
	if (dist1 < dist3) {
		System.out.println("Points One and Two are closest: " + dist1);
	} else {
		System.out.println("Points Two and Three are closest: " + dist3);
	}
} else if (dist2 < dist3) {
	System.out.println("Points One and Three are closest: " + dist2);
} else {
	System.out.println("Points Two and Three are closest: " + dist3);
}

System.out.println();
System.out.println("End of Program");

// classes

}}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}
