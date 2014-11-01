import java.util.Scanner;
public class HanoiTowers
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 2.3c
// Hanoi Towers

// Solution found at 
// http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/13/hanoi.html

// variables

String str;
int moves = 0, discs;
boolean moved = false, b = true;

System.out.print("Number of discs: ");
str = System.console().readLine();
discs = Integer.parseInt(str);

// define towers

Tower t1 = new Tower(1, new int[discs], 0);
Tower t2 = new Tower(2, new int[discs], 0);
Tower t3 = new Tower(3, new int[discs], 0);

// setup initial towers

for (int i = discs; i > 0 ; i--) {

	t1.discs[i-1] = discs - (i - 1);
	t1.index++;
}

t1.printDiscs();
t2.printDiscs();
t3.printDiscs();

System.console().readLine();

moveDiscsAtoC(discs);

t1.printDiscs();
t2.printDiscs();
t3.printDiscs();

System.console().readLine();

} private static void moveDiscsAtoC(int n) {

	if (n==1) {
		moveDisc(t1, t3, t1.discs[t1.index-1]);
	} else {
		//moveDiscsAtoB(n-1);
		
	
	}

} 

 private static void moveDisc (Tower fromTower, Tower toTower, int disc) {

	toTower.discs[toTower.index] = fromTower.discs[fromTower.index - 1];
	fromTower.discs[fromTower.index - 1] = 0;
	toTower.index++;
	fromTower.index--;

}

//moves = moveAtoC(discs, moves);

//println("Move " + discs + " discs from A to C");
//println("takes " + moves + " moves.");

 private static int moveAtoC (int n, int count) {

	count++;
	System.out.println(n);
	System.console().readLine();
	if (n == 1) {
		// pass
	} else {
		moveAtoB(n-1, count);
		moveAtoC(1, count);
		moveBtoC(n-1, count);
	}

	return count;
}

 private static int moveAtoB (int n, int count) {

	count++;
	System.out.println(n);
	System.console().readLine();
	if (n == 1) {
		// pass
	} else {
		moveAtoB(n-1, count);
	}

	return count;
	
}

 private static int moveBtoC (int n, int count) {

	count++;
	System.out.println(n);
	System.console().readLine();
	if (n == 1) {
		// pass
	} else {
		moveAtoC(n-1, count);
	}
	
	return count;
}

// classes

}

class Tower {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	int[] discs;
	int tower, index;
	
	Tower(int tower, int[] discs, int index) {
		this.tower = tower;
		this.discs = discs;
		this.index = index;
	}
	
	public void printDiscs() {
		System.out.print("Tower " + tower + ": ");
		for (int i : discs) {
			
			if ( i == 0 ) {
				System.out.print(" ");
			} else {
				System.out.print(i);
			}
			
		}
		System.out.println();
	}	
}
