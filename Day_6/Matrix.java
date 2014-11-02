// Day 6 - Exercise 3
// Matrix class

public class Matrix {

	// fields

	private int[][] m;
	private int rows, cols;
	
	// constructors
	
	public Matrix (int row, int col) {
	
		// allocate matrix
		
		this.rows = row;
		this.cols = col;
		this.m = new int[row][col];
		
		// initialise all elements to 1		
		
		for (int i = 0 ; i < row ; i++) {	//	rows
		
			for(int j = 0 ; j < col ; j++) {	// columns
			
				m[i][j] = 1;
			
			}
		
		}
		
		// print array
		
		prettyPrint();		
	
	}

	// methods
	
	public void setElement(int i, int j, int k) {
	
	}
	
	public void setRow(int i, String s) {
	
	}
	
	public void setColumn(int i, String s) {
	
	}
	
	public String toString() {
		
		String str = "[";
		
		for (int i = 0 ; i < this.rows ; i++) {	//	rows

			for(int j = 0 ; j < this.cols ; j++) {	// columns
			
				str += m[i][j] + ",";
			
			}
			
			str += "\b;";

		}
		
		return str + "\b]";
		
	}
	
	public void prettyPrint() {
		
		for (int i = 0 ; i < this.rows ; i++) {	//	rows

			for(int j = 0 ; j < this.cols ; j++) {	// columns
			
				System.out.print(m[i][j] + "\t");
			
			}
			
			System.out.println();
			
		}
	
	}

}