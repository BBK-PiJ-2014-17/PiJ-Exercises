import java.util.Scanner;
public class Maximising
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int i = 0, j = 0, max = 0;
String str;

System.out.println("Enter a sequences of numbers terminated by a -1.");

while (i != -1) {

    j++;
    
    System.out.print(j + ": ");
    str = System.console().readLine();
    i = Integer.parseInt(str);
    
    max = (max < i) ? i : max;

}

System.out.println("The largest number was: " + max);
}}

