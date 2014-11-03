

public class Target {

	int[][][] cube;
	int size;
	
	Target(int size) {
	
		this.size = size;
		cube = new int[this.size][this.size][this.size];
		
		init();
	
	}
	
	private void init() {
	
		for (int i = 0 ; i < this.size ; i++) {
		
			for (int j = 0 ; j < this.size ; j++) {
			
				for (int k = 0 ; k < this.size ; k++) {
								
					cube[i][j][k] = 0;
				
				}
				
			}
			
		}

		int randI = (int) Math.abs((this.size) * Math.random());
		int randJ = (int) Math.abs((this.size) * Math.random());
		int randK = (int) Math.abs((this.size) * Math.random());
		
		cube[randI][randJ][randK] = 1;
	
	}
	
	public Result fire(int x, int y, int z) {

		// check in range
		
		if (x > this.size || y > this.size || z > this.size
				|| x < 0 || y < 0 || z < 0) {	//	out of range
				
			System.out.println("Out of range...");
			return Result.OUT_OF_RANGE;
		
		} else {
		
			// left to right
			
			if (z - 1 >= 0) {	// left
		
				if (cube[x][y][z - 1] == 1) {
					System.out.println("You're to the left");
					return Result.FAIL_LEFT;
				}
			
			} else if (z + 1 <= this.size) {	// right
			
				if (cube[x][y][z + 1] == 1) {
					System.out.println("You're to the right");
					return Result.FAIL_RIGHT;
				}
			
			}
		
			// high to low
			
			if (y - 1 >= 0) {	// high
		
				if (cube[x][y - 1][z] == 1) {
					System.out.println("You're above");
					return Result.FAIL_HIGH;
				}
			
			} else if (y + 1 <= this.size) {	// low
			
				if (cube[x][y + 1][z] == 1) {
					System.out.println("You're below");
					return Result.FAIL_LOW;
				}
			
			}
			
			// long to short
		
			if (x - 1 >= 0) {	// long
		
				if (cube[x - 1][y][z] == 1) {
					System.out.println("You're long");
					return Result.FAIL_LONG;
				}
			
			} else if (x + 1 <= this.size) {	// short
			
				if (cube[x + 1][y][z] == 1) {
					System.out.println("You're short");
					return Result.FAIL_SHORT;
				}
			
			}
		
			// hit!
		
			if (cube[x][y][z] == 1) {	// hit
		
				System.out.println("HIT");
				return Result.HIT;
				
			}
			
			System.out.println("Miss");
			return Result.MISS;
			
		}
		
	}
	
	public void displayPlane(int p) {
	
		for (int i = 0 ; i < this.size ; i++) {	//	rows

			for(int j = 0 ; j < this.size; j++) {	// columns
			
				System.out.print(cube[p][i][j] + "\t");
			
			}
			
			System.out.println();
			
		}
		
		System.out.println();

	}
	
	public void displayTarget() {
		
		for (int i = 0 ; i < this.size ; i++) {
		
			displayPlane(i);
			
		}
	
	}

}