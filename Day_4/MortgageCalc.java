import java.util.Scanner;
public class MortgageCalc
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Day 4 - Exercise 3
// Mortgage Calculator

// variables

double b, y, t, a, r;
String str;

// Intro and user input request

System.out.println("***\tDay 4, Exercise 3 \t\t\t***");
System.out.println("***\tA BIT MORE PRACTICE WITH DOUBLES \t***");
System.out.println();
System.out.println("This program will calculate the total payment, annual payment");
System.out.println("and number of years to pay off interest, for a mortgage with");
System.out.println("given values, using methods. Please enter details of the");
System.out.println("mortgage at the prompt below.");
System.out.println();
System.out.print("Amount borrowed: ");
str = System.console().readLine();	//	receive user input
b = Double.parseDouble(str);
System.out.println();

System.out.print("Years Remaining: ");
str = System.console().readLine();	//	receive user input
y = Double.parseDouble(str);
System.out.println();

System.out.print("Interest Rate: ");
str = System.console().readLine();	//	receive user input
r = Double.parseDouble(str);
System.out.println();

t = calculateTotalAmount(b, r);	//	get total amount
a = calculateAnnualPayment(t, y);	//	get annual payment

// display results

System.out.println("Total Amount paid: " + t);
System.out.println("Annual Payment: " + a);
System.out.println("Number of years before interest paid: " + calculateYearsBeforeInterestPaid((r/100) * b, a));

System.out.println();
System.out.println("End of Program");

// methods

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

