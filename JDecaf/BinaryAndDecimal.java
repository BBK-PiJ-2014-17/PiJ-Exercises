import java.util.Scanner;
public class BinaryAndDecimal
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Binary to Decimal

String str, b;
double d;

System.out.println("Command List:");
System.out.println("1.\t- Binary to Decimal");
System.out.println("2.\t- Decimal to Binary");
System.out.print(">> ");
str = System.console().readLine();

switch (str) {
	case "1": 	System.out.println("Enter Binary number");
				System.out.print(">> ");
				str = System.console().readLine();
				System.out.println("Decimal: " + binary2decimal(str));
				break;
				
	case "2": 	System.out.println("Enter Decimal number");
				System.out.print(">> ");
				str = System.console().readLine();
				d = Double.parseDouble(str);
				System.out.println("Binary: " + decimal2binary(d));
				break;
				
	default:	System.out.println("Non-valid selection");
				break;
}

} private static double binary2decimal(String b) {
	
	int power = 0, count = b.length() - 1;
	double d = 0.0;
	
	for (int i = count; i >= 0 ; i--) {
		
		d += (Character.getNumericValue(b.charAt(i)) * Math.pow(2,power));
		power++;
	}

	return d;
}

static String decimal2binary(double d) {
	
	String s = "";
	int i = (int)d, r;
	
	// integer part
	
	while (i > 0) {
	
		r = i % 2;
		
		if (r == 1) i--;
		
		i = i / 2;
	
		s = r + s;
				
		System.out.println(s);
	
	}
	
	return s;
	
}	
	
	
	

}

