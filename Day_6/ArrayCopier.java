// Day 6 - Exercise 2
// ArrayCopier class

public class ArrayCopier {

	public void copy (int[] src, int[] dst) {
	
		int len = Math.max(src.length,dst.length);
		
		for (int i = 0 ; i < len ; i++) {
			
			if	(i > dst.length - 1) {
			
				break;
			
			} else if (i > src.length - 1) {
			
				dst[i] = 0;
			
			} else {
				
				dst[i] = src[i];
				
			}
		
		}
	
	}

}