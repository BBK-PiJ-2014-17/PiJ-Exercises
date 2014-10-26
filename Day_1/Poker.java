import java.util.Scanner;
public class Poker
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
// Analyse a Poker Hand

String card1, card2, card3, card4, card5;
String suit1 = "", suit2 = "", suit3 = "", suit4 = "", suit5 = "";
String str;
int i = 1;

System.out.println("Enter 5 cards, number followed by suit.");

System.out.print("First card: ");
card1 = System.console().readLine();
System.out.println();

while (i > 0) {

	System.out.print("First suit: ");
	suit1 = System.console().readLine();
	if (suit1.equals("Hearts") || suit1.equals("Clubs")
			|| suit1.equals("Diamonds") || suit1.equals("Spades")) {
		
		i = -1;
		System.out.println();	
		
	} else {
	
		System.out.println("Please re-enter a valid suit from the following list:");
		System.out.println("Hearts");
		System.out.println("Clubs");
		System.out.println("Diamonds");
		System.out.println("Spades");
	
	}
	
}

i = 1;

System.out.print("Second card: ");
card2 = System.console().readLine();
System.out.println();

while (i > 0) {

	System.out.print("Second suit: ");
	suit2 = System.console().readLine();
	if (suit2.equals("Hearts") || suit2.equals("Clubs")
			|| suit2.equals("Diamonds") || suit2.equals("Spades")) {
		
		i = -1;
		System.out.println();	
		
	} else {
	
		System.out.println("Please re-enter a valid suit from the following list:");
		System.out.println("Hearts");
		System.out.println("Clubs");
		System.out.println("Diamonds");
		System.out.println("Spades");
	
	}
	
}

i = 1;

System.out.print("Third card: ");
card3 = System.console().readLine();
System.out.println();

while (i > 0) {

	System.out.print("Third suit: ");
	suit3 = System.console().readLine();
	if (suit3.equals("Hearts") || suit3.equals("Clubs")
			|| suit3.equals("Diamonds") || suit3.equals("Spades")) {
		
		i = -1;
		System.out.println();	
		
	} else {
	
		System.out.println("Please re-enter a valid suit from the following list:");
		System.out.println("Hearts");
		System.out.println("Clubs");
		System.out.println("Diamonds");
		System.out.println("Spades");
	
	}
	
}

i = 1;

System.out.print("Forth card: ");
card4 = System.console().readLine();
System.out.println();

while (i > 0) {

	System.out.print("Forth suit: ");
	suit4 = System.console().readLine();
	if (suit4.equals("Hearts") || suit4.equals("Clubs")
			|| suit4.equals("Diamonds") || suit4.equals("Spades")) {
		
		i = -1;
		System.out.println();	
		
	} else {
	
		System.out.println("Please re-enter a valid suit from the following list:");
		System.out.println("Hearts");
		System.out.println("Clubs");
		System.out.println("Diamonds");
		System.out.println("Spades");
	
	}
	
}


i = 1;

System.out.print("Fifth card: ");
card5 = System.console().readLine();
System.out.println();

while (i > 0) {

	System.out.print("First suit: ");
	suit5 = System.console().readLine();
	if (suit5.equals("Hearts") || suit5.equals("Clubs")
			|| suit5.equals("Diamonds") || suit5.equals("Spades")) {
		
		i = -1;
		System.out.println();	
		
	} else {
	
		System.out.println("Please re-enter a valid suit from the following list:");
		System.out.println("Hearts");
		System.out.println("Clubs");
		System.out.println("Diamonds");
		System.out.println("Spades");
	
	}
	
}

System.out.println("Your cards are:");
System.out.println(card1 + " of " + suit1);
System.out.println(card2 + " of " + suit2);
System.out.println(card3 + " of " + suit3);
System.out.println(card4 + " of " + suit4);
System.out.println(card5 + " of " + suit5);



}}

