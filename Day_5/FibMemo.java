import java.util.Scanner;
public class FibMemo
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str;
int n;
boolean b = true;
int[] fibResults;

System.out.println("Enter number");
System.out.print(">> ");
str = System.console().readLine();
n = Integer.parseInt(str);

fibResults = new int[n];

fibResults[0] = 1;
fibResults[1] = 1;

System.out.println(fibNum(0));

} private static int fibNum(int n) {

	return fibResults[n];

}
}

