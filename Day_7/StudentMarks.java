import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        boolean b = true;
        Scanner sc = new Scanner(System.in);
        int count = 0, fail = 0, pass = 0, dist = 0, invalid = 0;

        System.out.println("Please enter student marks and end the inputs with a '-1'.");
        System.out.println();

        do {

            System.out.print(">> ");
            String str = sc.nextLine();
            int i = Integer.parseInt(str);

            if (str.equals("-1")) {

                b = false;
                break;

            } else {

                count++;

                if (i >= 0 && i < 50) { //  fail
                    fail++;
                } else if (i >= 50 && i < 70) { //  pass
                    pass++;
                } else if (i >= 70 && i < 101) { //  distinction
                    dist++;
                } else {
                    invalid++;
                }

            }


        } while (b);

        System.out.println("There are " + count + " students.");
        System.out.println(dist + " distinction(s)");
        System.out.println(pass + " pass(es)");
        System.out.println(fail + " fail(s)");
        System.out.println(invalid + " invalid inputs");

    }

}