import java.util.Scanner;
public class Sorting
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 7
// Sort 3 numbers

// variables

int x, y, z;
int low, mid, high, temp;
String str;

// Intro and user input request

System.out.println("***\tDay 1, Exercise 7 \t\t***");
System.out.println("***\tNAIVE SORTING	\t\t***");
System.out.println();
System.out.println("This program will sort three positive integers into");
System.out.println("the correct numerical order. Please enter three numbers");
System.out.println("at the prompts given below.");
System.out.println();
System.out.print(">> 1: ");
str = System.console().readLine();	// receive user input
x = Integer.parseInt(str);
System.out.print(">> 2: ");
str = System.console().readLine();	// receive user input
y = Integer.parseInt(str);
System.out.print(">> 3: ");
str = System.console().readLine();	// receive user input
z = Integer.parseInt(str);

// initial set positions, to be changed.

low = x;
mid = y;
high = z;

// test first 2 places and switch if necessary

if (low > mid) {
    temp = low;
    low = mid;
    mid = temp;
}

// test second 2 places and switch if necessary

if (mid > high) {
    temp = mid;
    mid = high;
    high = temp;
}

// re test first 2 places and switch if necessary

if (low > mid) {
    temp = low;
    low = mid;
    mid = temp;
}

System.out.println(low + " " + mid + " " + high);
System.out.println();
System.out.println("End of Program");
}}

