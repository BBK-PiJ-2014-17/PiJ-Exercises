import java.util.Scanner;
public class Hanoi2
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 5 - Exercise 2.3c
// Hanoi Towers


// variables

String str;
int moves = 0, discs;
boolean moved = false, b = true;

System.out.print("Number of discs: ");
str = System.console().readLine();
discs = Integer.parseInt(str);

Hanoi h = new Hanoi(discs);

// classes

}}

class Hanoi {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}

Tower t1, t2, t3;
int discs, moveCount = 0;

	Hanoi(int discs) {
	
		System.out.println("Creating Hanoi Object");
		
		this.discs = discs;
		t1 = new Tower(1, new int[discs], 0);
		t2 = new Tower(2, new int[discs], 0);
		t3 = new Tower(3, new int[discs], 0);
		
		
		for (int i = discs; i > 0 ; i--) {
			t1.discs[i-1] = discs - (i - 1);
			t1.index++;
		}
		
		t1.printDiscs();
		t2.printDiscs();
		t3.printDiscs();
		
		start();
		
		System.out.println("Hanoi Finished!");
	
	}
	
	private void start() {
	
		System.out.println("Starting transition");
		
		// move A to C
		moveDiscsFromTo(t1, t3, this.discs);
		
	}
	
	
	void moveDiscsFromTo(Tower fromTower, Tower toTower, int n) {
	
		//println("From tower: " + fromTower.tower);
		//println("To tower: " + toTower.tower);
	
		// find spareTower
		
		Tower spareTower = new Tower();
		
		if (fromTower.tower == 1 && toTower.tower == 2) {
		
			spareTower = t3;
		
		} else if (fromTower.tower == 1 && toTower.tower == 3) {
		
			spareTower = t2;
		
		} else if (fromTower.tower == 2 && toTower.tower == 3) {
	
			spareTower = t1;
		
		} else if (fromTower.tower == 2 && toTower.tower == 1) {
		
			spareTower = t3;
		
		} else if (fromTower.tower == 3 && toTower.tower == 1) {
		
			spareTower = t2;
		
		} else if (fromTower.tower == 3 && toTower.tower == 2) {
		
			spareTower = t1;
		
		}
		
		//println("Spare tower: " + spareTower.tower);
	
		if (n==1) {
			moveDisc(fromTower, toTower);
			//moveDisc(fromTower, toTower, fromTower.discs[fromTower.index-1]);
		} else {
			
			moveDiscsFromTo(fromTower, spareTower, n-1);
			moveDisc(fromTower, toTower);
			moveDiscsFromTo(spareTower, toTower, n-1);
			
		}
		
		//t1.printDiscs();
		//t2.printDiscs();
		//t3.printDiscs();
		//println();
		//System.console().readLine();

	}	 
	
	//private void moveDisc (Tower fromTower, Tower toTower, int disc) {
	private void moveDisc (Tower fromTower, Tower toTower) {

		//println("Moving disc: " + fromTower.discs[fromTower.index - 1]);
		//println("from tower: " + fromTower.tower);
		//println("to tower: " + toTower.tower);
	
		toTower.discs[toTower.index] = fromTower.discs[fromTower.index - 1];
		fromTower.discs[fromTower.index - 1] = 0;
		toTower.index++;
		fromTower.index--;
		
		moveCount++;
		
		t1.printDiscs();
		t2.printDiscs();
		t3.printDiscs();
		System.out.println("Move Count: " + moveCount);
		System.out.println();
		System.console().readLine();

	}

}

class Tower {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	int[] discs;
	int tower, index;
	
	
	Tower() {
		
	};
	
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
