import java.util.Scanner;
public class Rectangle
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Compute the area of a rectangle based on two points

String str;
double width, height, peri, area;

Point one = new Point();
Point two = new Point();

System.out.println("Please enter three coordinates");
System.out.print("First coordinate X: ");
str = System.console().readLine();
one.x = Double.parseDouble(str);

System.out.print("First coordinate Y: ");
str = System.console().readLine();
one.y = Double.parseDouble(str);

System.out.print("Second coordinate X: ");
str = System.console().readLine();
two.x = Double.parseDouble(str);

System.out.print("Second coordinate Y: ");
str = System.console().readLine();
two.y = Double.parseDouble(str);

Rect r = new Rect();
r.upLeft = one;
r.downRight = two;

width = (r.downRight.x - r.upLeft.x);
height = (r.upLeft.y - r.downRight.y);

System.out.println();

// Perimeter

peri = (2.0 * width) + (2.0 * height);
System.out.println("Rectangle perimeter: " + peri);

// Area

area = width * height;
System.out.println("Rectangle area: " + area);

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
