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
	
	public void setMatrix(String s) {
	
		// finish!
	
	}
	
	public void setElement(int row, int col, int value) {
		
		// validate indexes
		
		if (row <= rows && col <= cols) {
		
			m[row][col] = value;
		
		} else {
		
			System.out.println("Invalid index");
		
		}
		
		prettyPrint();
		
	}
	
	public void setRow(int i, String s) {
	
		String[] splt = s.split(",");
		
		if (splt.length == cols) {
		
			for (int j = 0 ; j < cols ; j++) {
				
				m[i][j] = Integer.parseInt(splt[j]);
				
			}
			
		} else {
		
			System.out.println("Invalid input");
			
		}
		
	}
	
	public void setColumn(int i, String s) {
	
		String[] splt = s.split(",");
				
		if (splt.length == rows) {
		
			for (int j = 0 ; j < rows ; j++) {
				
				m[j][i] = Integer.parseInt(splt[j]);
				
			}
			
		} else {
		
			System.out.println("Invalid input");
			
		}
	
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
		
		System.out.println();
	
	}

}