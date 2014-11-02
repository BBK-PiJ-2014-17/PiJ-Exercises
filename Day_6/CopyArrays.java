import java.util.Scanner;
public class CopyArrays
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 6 - Exercise 2
// Copy arrays using ArrayCopier object

// variables

int[] src = new int[5];
src[0] = 1;
src[1] = 2;
src[2] = 3;
src[3] = 4;
src[4] = 5;


int[] dst = new int[7];
dst[0] = 4;
dst[1] = 5;
dst[2] = 6;
dst[3] = 7;
dst[4] = 8;
dst[5] = 6;
dst[6] = 7;

// Intro and user input request

System.out.println("***\tDay 6, Exercise 2 \t\t***");
System.out.println("***\tCOPYING ARRAYS \t\t\t***");
System.out.println();
System.out.println("This program will copy one integer array into a second");
System.out.println("integer array, using a method of a class called ArrayCopier.");
System.out.println("Press any key to continue.");
System.console().readLine();	// receive user input for command
System.out.println();

System.out.println("Source Array");
printArray(src);

System.out.println("Target Array");
printArray(dst);

System.out.println("Perform Copy");
System.out.println("............");

ArrayCopier a = new ArrayCopier();

a.copy(src, dst);

System.out.println("New Target Array");
printArray(dst);

// methods

} private static void printArray(int[] a) {

	for (int i : a) {
		System.out.print(i);
		System.out.print(", ");
	}
	
	System.out.println();
	
}
}

