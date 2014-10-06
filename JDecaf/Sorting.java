import java.util.Scanner;
public class Sorting
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Sort 3 numbers

int x, y, z;
int low, mid, high, temp;
String str;

System.out.println("Enter 3 numbers to be sorted.");
System.out.print("1: ");
str = System.console().readLine();
x = Integer.parseInt(str);
System.out.print("2: ");
str = System.console().readLine();
y = Integer.parseInt(str);
System.out.print("3: ");
str = System.console().readLine();
z = Integer.parseInt(str);

low = x;
mid = y;
high = z;

// first 2 places

if (low > mid) {
    temp = low;
    low = mid;
    mid = temp;
}

// second 2 places

if (mid > high) {
    temp = mid;
    mid = high;
    high = temp;
}

// first 2 places

if (low > mid) {
    temp = low;
    low = mid;
    mid = temp;
}

System.out.println(low + " " + mid + " " + high);
}}

