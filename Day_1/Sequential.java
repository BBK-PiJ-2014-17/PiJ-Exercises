import java.util.Scanner;
public class Sequential
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 1 - Exercise 9 / 10
// Check if a sequence of numbers was consecutive
// NB: modified to satisfy exercise 10 conditions

// variables

int i = 0, j = 0, prev = 0, inc = 0;
boolean seq = true, startSet = false, dir = true;
String str;

// Intro and user input request

System.out.println("***\tDay 1, Exercise 9/10 \t\t\t***");
System.out.println("***\tGOING UP!	\t\t\t***");
System.out.println("***\tYOU SAID HIGH, I SAID LOW	\t***");
System.out.println("This program will read in a sequence of numbers terminated");
System.out.println("by a '-1', and then confirm if the sequence was consecutive.");
System.out.println("Please enter the sequence of numbers at the prompts");
System.out.println("below, and enter '-1' to end the input.");
System.out.println();

// main loop

while (i != -1) {	// while input is not '-1', continue

    j++;
    
    System.out.print(">> " + j + ": ");
    str = System.console().readLine();	//	receive user input
    i = Integer.parseInt(str);
    
    if (i == -1) { break; }	//	do not include '-1' in sequence, break
    
    if (startSet) {	//	initial false until set, to get starting point
					// 	for determining direction.
        
        if (seq) {	//	if sequence is consecutive, continue
            dir = (i > prev) ? true : false;	// true for increasing, false decreasing
            inc = (dir) ? 1 : -1;	//	increment require for number to be consecutive
            seq = (i - prev == inc) ? true : false;	// test if consecutive
        } else {
            //pass
        }
        
        prev = i;
        
    } else {	//	set starting point.
        prev = i;
        startSet = true;
    }

}

// display result

if (seq) {	// consecutive
	if(dir) {	// increasing
		System.out.println("The input sequence was consecutive and increasing");
	} else {
		System.out.println("The input sequence was consecutive and decreasing");
	}
} else {	//	not consecutive
	System.out.println("The input sequence was not consecutive.");
}

System.out.println();
System.out.println("End of Program");
}}

