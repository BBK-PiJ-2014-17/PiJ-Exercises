// Day 6 - Exercise 5
// Matrix Checker class

public class MatrixChecker {

	public boolean isSymmetrical(int[] a) {
		
		int j;
		boolean b = true;
		
		for (int i = 0 ; i < (int)(a.length / 2) ; i++) {	// loop to middle of string
		
			j = (a.length - 1) - i;	//	move towards middle from end of string
				
			if (a[i] == a[j]) {
				//pass
			} else {
				b = false;	//	not a palindrome
			}
		
		}
		
		return b;
	
	}

	public boolean isSymmetrical(int[][] a) {
	
		return true;
	
	}
	
	public boolean isTriangular(int[][] a) {
	
		return true;
	
	}

}