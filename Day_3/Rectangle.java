import java.util.Scanner;
public class Rectangle
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 3 - Exercise 13
// Compute the area of a rectangle based on two points

// variables

String str;
double width, height, peri, area;
Point one = new Point();
Point two = new Point();

// Intro and user input request

System.out.println("***\tDay 3, Exercise 13 \t\t***");
System.out.println("***\tRECTANGLE	\t\t***");
System.out.println();
System.out.println("This program will read in the upper left coordinate and the bottom");
System.out.println("lower right coordinate, and calculate the area of a rectangle");
System.out.println("constructed using these coordinates. Please enter the points using");
System.out.println("the prompts below.");
System.out.println();

System.out.print("Upper left X: ");
str = System.console().readLine();	//	receive user input 1
one.x = Double.parseDouble(str);

System.out.print("Upper left Y: ");
str = System.console().readLine();	//	receive user input 1
one.y = Double.parseDouble(str);

System.out.print("Lower right X: ");
str = System.console().readLine();	//	receive user input 2
two.x = Double.parseDouble(str);

System.out.print("Lower right Y: ");
str = System.console().readLine();	//	receive user input 2
two.y = Double.parseDouble(str);

// construct rectangle

Rect r = new Rect();
r.upLeft = one;
r.downRight = two;

// calculate width and height

width = (r.downRight.x - r.upLeft.x);
height = (r.upLeft.y - r.downRight.y);

// display results

System.out.println();

// Perimeter

peri = (2.0 * width) + (2.0 * height);
System.out.println("Rectangle perimeter: " + peri);

// Area

area = width * height;
System.out.println("Rectangle area: " + area);

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
