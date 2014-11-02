import java.util.Scanner;
public class BigStack
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 8
// Measure size of stack in method calls

// variables

String str;

// Intro and user input request

System.out.println("***\tDay 5, Exercise 8 \t\t\t***");
System.out.println("***\tHOW BIG IS YOUR STACK?	\t\t***");
System.out.println();
System.out.println("This program will call a method recusively until the stack overflows");
System.out.println("Start the program by pressing any key.");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input

try {

	measureStack(1);
	
} catch(StackOverflowError e)  {
	System.out.println("End of Stack");
} finally {
	
}

} private static void measureStack(int count) {
	System.out.println(count);
	measureStack(count + 1);
}
}

