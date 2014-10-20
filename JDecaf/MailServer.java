import java.util.Scanner;
public class MailServer
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
/*** Simplified Mail Server ***/

// 1. Provide command prompt for sender address and read in 
//    email with format "MAIL FROM: <email-address>"
// 2. Check validity of email format
// 3. Provide command prompt for recipient and read in 
//    email with format: "RCPT FROM: <email-address>"
// 4. Check validity of email format
// 5. Provide prompt to enter command DATA_CONVERSION
// 6. Read in email body until sentence with single . entered
// 7. Output email
// 8. Provide prompt for QUIT command
//
// NB: Ensure all commands are valid

String input, str;
s
System.out.println("Welcome to the Simplified Mail Server!");
System.out.println();

while(true) {

	printCommands();
	input = providePrompt();
	
}

String providePrompt() {
	
	System.out.print(">> ");
	str = System.console().readLine();
	return str;
	
}

public enum Cmd {
	MAIL, RCPT, FROM, DATA, QUIT
}

} private static void validateCommand(String cmd) {

	

}

 private static void printCommands() {
	System.out.println("Command List:");
	System.out.println("	- MAIL FROM: <email-address>");
	System.out.println("	- RCPT FROM: <email-address>");
	System.out.println("	- DATA <email-body>");
	System.out.println("	- QUIT <email-body>");
	System.out.println();
}

}

class Email {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	
	String local, domain;
	boolean valid;
	
	Email(String local, String domain) {
		this.local = local;
		this.domain = domain;
		this.valid = isEmailValid(this);
	}

	boolean isEmailValid(Email) {
		
		// 
		
	}
	
}
