/*** Simplified Mail Server ***/

// 1. Provide command prompt for sender address and read in
//    email with format "MAIL FROM: <email-address>"
// 2. Check validity of email format
// 3. Provide command prompt for recipient and read in
//    email with format: "RCPT TO: <email-address>"
// 4. Check validity of email format
// 5. Provide prompt to enter command DATA
// 6. Read in email body until sentence with single . entered
// 7. Output email
// 8. Provide prompt for QUIT command
//
// NB: Ensure all commands are valid

    // check error re DATA command, emails entered?!
    // email cannot contain numbers, change this.
    // Finish DATA command
    // Finish domain checks

public class JavaMailServer {

// class variables

private static String input, str, data; // input and read strings
private static Email from, to; // email instances for to and from emails
private static boolean loop = true, toChosen = false, fromChosen = false; // main loop control and
                                                                          // command control flags

    // main program loop

    public static void main(String[] args) {

        // Introduce Mail Server

        System.out.println();
        System.out.println("Welcome to the Simplified Mail Server!");
        System.out.println();
        printCommands(); // display usage commands

        // provide program prompt until QUIT entered

        while(loop) {
            input = providePrompt(); // display user prompt
            System.out.println();
            validateCommand(input); // validate input
        }

    }

    /*** METHODS ***/

    // display command menu

    private static void printCommands() {
        System.out.println("Command List:");
        System.out.println();
        System.out.println("	- MAIL FROM:    <email-address>");
        System.out.println("	- RCPT TO:      <email-address>");
        System.out.println("	- DATA          <email-body>");
        System.out.println("	- HELP");
        System.out.println("	- QUIT");
        System.out.println();
    }

    // display program prompt

    private static String providePrompt() {

        System.out.print(">> ");
        str = System.console().readLine();
        return str;

    }

    // display email

    private static void displayEmail() {

        System.out.println("Email Summary");
        System.out.println("\tfrom :\t" + from.email);
        System.out.println("\tto :\t" + to.email);
        System.out.println();
        System.out.println(data);
        System.out.println();
        System.out.println("End of Email");

    }

    // validate input command and perform action if okay

    private static String validateCommand(String s) {

        // method variables

        Email e = null;    // store email if entered and valid
        String cmd, eStr;   // store command and email input
        String[] sSplitBySpace, sSplitByColon;  // string arrays for command validity checking

        // is command valid?
        // check if command contains " "

        if (s.contains(" ")) {
            sSplitBySpace = s.split(" ");
            cmd = sSplitBySpace[0];
        } else {cmd = s;}

        // check if command contains :

        if (s.contains(":")) {
            sSplitByColon = s.split(":");
            eStr = sSplitByColon[1];
            e = new Email(eStr);
        } else {eStr = "";}

        // check command matches valid command and if so check email

        switch (cmd) {
            case "MAIL":
                if (e.valid) {
                    from = e;
                    fromChosen = true;
                }
                break;
            case "RCPT":
                if (e.valid) {
                    to = e;
                    toChosen = true;
                };
                break;
            case "DATA":
                if (fromChosen && toChosen) {
                    boolean b = true;
                    String a;
                    while(b) {

                        s = System.console().readLine();
                        System.out.println(s);
                        if (s == ".") {b = false; break;}
                        data += s;

                    }
                } else {
                    System.out.println("Please enter valid MAIL and RCPT emails first.");
                    System.out.println();
                }
                break;
            case "HELP":
                if(fromChosen) System.out.println("Mail from: " + from.email);
                if(toChosen) System.out.println("Recipient: " + to.email);
                System.out.println();
                printCommands();
                break;
            case "QUIT":
                System.out.println("EXITING PROGRAM");
                loop = false;
                break;
            default:
                System.out.println("Invalid Command");
                System.out.println();
                break;
        }

        return cmd;

    }

    /*** INNER CLASSES ***/

    // Email class to store email

    public static class Email {

        private String local, domain, email;
        private boolean valid;

        Email(String email) {
            this.email = email.trim();
            this.valid = this.isEmailValid();
        }

        private boolean isEmailValid() {

            boolean b = true;
            String err = null;

            System.out.println("Checking email validity");
            System.out.println();
            System.out.println("\tEmail:\t" + this.email);

            if(splitEmail(this.email)) {

                // check local and domain are valid.

                // are all characters letters?

                if (!this.local.matches("[a-zA-Z]+")) {
                    b = false;
                    err += "Invalid character in local\n";
                }

            } else {b = false;}

            System.out.println("\tValid:\t" + b);
            if (err!= null) System.out.println("\tError:\t" + err);
            return b;

        }

        private boolean isDomainValid() {return true;}

        private boolean splitEmail(String e) {

            if (!e.contains("@")) return false; // if the email does not contain @ exit false
            if (!e.contains(".")) return false; // if the email does not contain . exit false

            String[] eSplitByAt = e.split("@");

            if (eSplitByAt.length > 2 || eSplitByAt.length < 1
                    || eSplitByAt[0] == null || eSplitByAt[1] == null) {

                // if there are more or less than 1 @ symbol exit
                // also exit if @ symbol is first or last

                System.out.println("Invalid Email");
                this.valid = false;
                return false;

            } else {

                this.local = eSplitByAt[0];
                this.domain = eSplitByAt[1];
                System.out.println("\tLocal:\t" + this.local);
                System.out.println("\tDomain:\t" + this.domain);
                System.out.println();
                return true;
            }

        }

    }

}