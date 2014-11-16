import java.util.Scanner;
public class Test
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Hello");

for (ListType t : ListType.values()) {
    System.out.println(t);
}

ListType lt = ListType.DOUBLE;

if (lt == ListType.DOUBLE) {
	System.out.println("Yay");
}
}}

