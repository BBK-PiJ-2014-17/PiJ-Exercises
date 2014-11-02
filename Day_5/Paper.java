import java.util.Scanner;
public class Paper
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 3
// Calculate Paper sizes

// variables

String str;
int a0_short = 594, a0_long = 841;

PaperObj a0 = new PaperObj("A0", a0_short, a0_long);

// Intro and user input request

System.out.println("***\tDay 5, Exercise 3 \t\t***");
System.out.println("***\tPAPER SIZES	\t\t***");
System.out.println();
System.out.println("This program will read in a paper size as a string and return");
System.out.println("the dimensions of the paper is mm. Please enter a paper size");
System.out.println("at the prompt below, e.g. A4, or A0000");
System.out.println();
System.out.print(">> ");
str = System.console().readLine();	// receive user input

PaperObj input = new PaperObj(str);

calculatePaperSize(input);

System.out.println("Long side: " + input.longSide);
System.out.println("Short side: " + input.shortSide);

System.out.println();
System.out.println("End of Program");

// methods

} private static PaperObj calculatePaperSize(PaperObj p) {
		
	System.out.println("Size = " + p.size);
	
	if (p.size.equals("A0")) {
	
		System.out.println ("Base A0");
	
		p.longSide = 1189;
		p.shortSide = 841;
		return p;
		
	} else if (p.size.length() == 2) {	//	smaller than A0 sizes, up to A9 only
			
		int i = Integer.parseInt(p.size.substring(1,2));
		i--;
		String nextSize = p.size.substring(0,1) + i;
	
		p.longSide = calculatePaperSize(new PaperObj(nextSize)).shortSide;
		p.shortSide = calculatePaperSize(new PaperObj(nextSize)).longSide / 2;
		
		return p;
	
	} else if (p.size.length() > 2) {	//	greater than A0, assuming only 0's received
		
		String s = p.size.substring(1,p.size.length());
		
		// check all zeros
		
		for (int i = 0 ; i < s.length() ; i++) {
		
			if (s.charAt(i) != "0".charAt(0)) {
				System.out.println("Invalid paper size");
				return p;
			}
		
		}
		
		String nextSize = "A" + s.substring(0,s.length() - 1);
		
		p.longSide = calculatePaperSize(new PaperObj(nextSize)).shortSide * 2;
		p.shortSide = calculatePaperSize(new PaperObj(nextSize)).longSide;
		
		return p;
		
	} else {
		return p;
	}

}

// classes

}

class PaperObj {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	String size;
	int longSide;
	int shortSide;
	
	PaperObj (String size) {
		this.size = size;
	}
	
	PaperObj (String size, int longSide, int shortSide) {
		this.size = size;
		this.longSide = longSide;
		this.shortSide = shortSide;		
	}
	/***	public Paper calculatePaperSize(Paper p) {
	
		Paper q = new Paper(p.size);
		
		if (p.size == "A0") {
			q.longSide = a0.longSide;
			q.shortSide = a0.shortSide;
			return q;
		}
	
	}
	***/
}

/***class Size {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	String letter;
	int number;
	
	Size (String l, int n) {
		this.letter = l;
		this.number = n;
	}
}
***/
