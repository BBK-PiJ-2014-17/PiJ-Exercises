import java.util.Scanner;
public class PrimesT1000
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// output the first 1000 primes

boolean prime = true;
int i = 4, j = 1, count = 2; // start at 4/2 to account for first 2 primes output before the main loop

System.out.println("2");
System.out.println("3");

while (count < 1000) {
	
	j = 1;
    
    while (j < i/2) {
        j++;
    	if (i % j == 0) {
    	    prime = false;
    	}
    }
    
    if (prime) {
        System.out.println(i);
		count++;
    } else {
        //pass
    }
	
	prime = true;
	i++;

}
}}

