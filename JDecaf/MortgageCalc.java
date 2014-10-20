import java.util.Scanner;
public class MortgageCalc
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Mortgate Calculator

double b, y, t, a, r;
String str;

System.out.println("Please enter the details of your mortgage");
System.out.print("Amount borrowed: ");
str = System.console().readLine();
b = Double.parseDouble(str);
System.out.println();

System.out.print("Years Remaining: ");
str = System.console().readLine();
y = Double.parseDouble(str);
System.out.println();

System.out.print("Interest Rate: ");
str = System.console().readLine();
r = Double.parseDouble(str);
System.out.println();

t = calculateTotalAmount(b, r);
a = calculateAnnualPayment(t, y);

System.out.println("Total Amount paid: " + t);
System.out.println("Annual Payment: " + a);
System.out.println("Number of years before interest paid: " + calculateYearsBeforeInterestPaid(r * b, a));

} private static double calculateTotalAmount(double cost, double rate) {

	return cost * (1 + rate / 100);

}

 private static double calculateAnnualPayment(double total, double years) {

	return total / years;

}

 private static double calculateYearsBeforeInterestPaid(double interest, double annualPayment) {

	return interest / annualPayment;

}
}

