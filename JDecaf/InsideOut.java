import java.util.Scanner;
public class InsideOut
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Is a point inside the given rectangle?

String str;
double width, height, peri, area;

Point one = new Point();
Point two = new Point();
Point three = new Point();

System.out.println("Please enter the coordinates of a rectangle,");
System.out.println("top left followed by bottom right.");
System.out.print("Top left X: ");
str = System.console().readLine();
one.x = Double.parseDouble(str);

System.out.print("Top Left Y: ");
str = System.console().readLine();
one.y = Double.parseDouble(str);

System.out.print("Bottom Right X: ");
str = System.console().readLine();
two.x = Double.parseDouble(str);

System.out.print("Bottom Right Y: ");
str = System.console().readLine();
two.y = Double.parseDouble(str);

System.out.println("Please enter a third point");
System.out.print("Point X: ");
str = System.console().readLine();
three.x = Double.parseDouble(str);

System.out.print("Point Y: ");
str = System.console().readLine();
three.y = Double.parseDouble(str);

Rect r = new Rect();
r.upLeft = one;
r.downRight = two;

System.out.println(three.x);
System.out.println(three.y);
System.out.println(r.upLeft.x);
System.out.println(r.upLeft.y);
System.out.println(r.downRight.x);
System.out.println(r.downRight.y);

if (three.y < r.upLeft.y && three.y > r.downRight.y
		&& three.x < r.downRight.x && three.x > r.upLeft.x) {
	
	System.out.println("The point (" + three.x + "," + three.y + ") is contained");
	System.out.println("in the rectangle with top left (" + r.upLeft.x + "," + r.upLeft.y + ")");
	System.out.println("and bottom right (" + r.downRight.x + "," + r.downRight.y + ")");
	
} else {

	System.out.println("The point (" + three.x + "," + three.y + ") is not contained");
	System.out.println("in the rectangle with top left (" + r.upLeft.x + "," + r.upLeft.y + ")");
	System.out.println("and bottom right (" + r.downRight.x + "," + r.downRight.y + ")");
	
}

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
