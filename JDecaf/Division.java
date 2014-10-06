import java.util.Scanner;
public class Division
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Divide two integers without using the modulus
// or division operation

int i = 0, x, y, z;
String str;

System.out.println("Enter two numbers, largest first.");
System.out.print("1: ");
str = System.console().readLine();
x = Integer.parseInt(str);
System.out.print("2: ");
str = System.console().readLine();
y = Integer.parseInt(str);

z = x;

while(z >= y) {

    i++;
    z -= y;

}

System.out.println(y + " goes " + i + " times into " + x + " remainder " + z);
}}

