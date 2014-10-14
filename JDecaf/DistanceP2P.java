import java.util.Scanner;
public class DistanceP2P
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Read three points and calculate the closest two points

String str;
double dist1, dist2, dist3;

Point one = new Point();
Point two = new Point();
Point three = new Point();

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

System.out.print("Third coordinate X: ");
str = System.console().readLine();
three.x = Double.parseDouble(str);

System.out.print("Third coordinate Y: ");
str = System.console().readLine();
three.y = Double.parseDouble(str);

dist1 = Math.sqrt(Math.pow(one.x - two.x, 2.0) + Math.pow(one.y - two.y, 2.0));
dist2 = Math.sqrt(Math.pow(one.x - three.x, 2.0) + Math.pow(one.y - three.y, 2.0));
dist3 = Math.sqrt(Math.pow(two.x - three.x, 2.0) + Math.pow(two.y - three.y, 2.0));

System.out.println(dist1);
System.out.println(dist2);
System.out.println(dist3);

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

// classes

}}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}
