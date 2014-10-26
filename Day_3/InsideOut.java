import java.util.Scanner;
public class InsideOut
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 14
// Is a point inside the given rectangle?

// variables

String str;
double width, height, peri, area;
Point one = new Point();
Point two = new Point();
Point three = new Point();

// Intro and user input request

System.out.println("***\tDay 3, Exercise 14 \t\t***");
System.out.println("***\tINSIDE OR OUTSIDE	\t***");
System.out.println();
System.out.println("This program will read in the upper left coordinate and the bottom");
System.out.println("lower right coordinate of a rectangle. It will then ask for a point");
System.out.println("and it will check to see if the point is contained within the given");
System.out.println("rectangle. Please enter coordinates at the prompts below.");
System.out.println();

System.out.println("Please enter the coordinates of a rectangle,");
System.out.println("top left followed by bottom right.");
System.out.print("Top left X: ");
str = System.console().readLine();	//	receive user input 1
one.x = Double.parseDouble(str);

System.out.print("Top Left Y: ");
str = System.console().readLine();	//	receive user input 1
one.y = Double.parseDouble(str);

System.out.print("Bottom Right X: ");
str = System.console().readLine();	//	receive user input 2
two.x = Double.parseDouble(str);

System.out.print("Bottom Right Y: ");
str = System.console().readLine();	//	receive user input 2
two.y = Double.parseDouble(str);

System.out.println("Please enter a third point");
System.out.print("Point X: ");
str = System.console().readLine();	//	receive user input 3
three.x = Double.parseDouble(str);

System.out.print("Point Y: ");
str = System.console().readLine();	//	receive user input 3
three.y = Double.parseDouble(str);

// construct rectangle

Rect r = new Rect();
r.upLeft = one;
r.downRight = two;

//println(three.x);
//println(three.y);
//println(r.upLeft.x);
//println(r.upLeft.y);
//println(r.downRight.x);
//println(r.downRight.y);

if (three.y < r.upLeft.y && three.y > r.downRight.y
		&& three.x < r.downRight.x && three.x > r.upLeft.x) {
	
	// if point contained inside rectangle boundaries
	
	System.out.println("The point (" + three.x + "," + three.y + ") is contained");
	System.out.println("in the rectangle with top left (" + r.upLeft.x + "," + r.upLeft.y + ")");
	System.out.println("and bottom right (" + r.downRight.x + "," + r.downRight.y + ")");
	
} else {

	// if point not contained inside rectangle boundaries

	System.out.println("The point (" + three.x + "," + three.y + ") is not contained");
	System.out.println("in the rectangle with top left (" + r.upLeft.x + "," + r.upLeft.y + ")");
	System.out.println("and bottom right (" + r.downRight.x + "," + r.downRight.y + ")");
	
}

System.out.println();
System.out.println("End of Program");

// classes

}}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}

class Rect {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	Point upLeft;
	Point downRight;
}
