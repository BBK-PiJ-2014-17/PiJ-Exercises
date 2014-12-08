public class GenericListScript {

    public static void main(String[] args) {

        GenericListScript gls = new GenericListScript();
        gls.start();

    }

    public void start() {

        System.out.println("Running Generic List script...");

        GenericDoubleLinkList<String> employeeNames = new GenericDoubleLinkList<>();
        GenericDoubleLinkList<Integer> employeeNumbers = new GenericDoubleLinkList<>();

        System.out.println("\nInitial state:");
        System.out.println();
        System.out.print("Employee names: ");
        employeeNames.print();
        System.out.print("Employee numbers: ");
        employeeNumbers.print();
        System.out.println();

        // add employee

        employeeNames.add("Basil");
        employeeNumbers.add(10010101);

        System.out.println("\nAdded first employee:");
        System.out.println();
        System.out.print("Employee names: ");
        employeeNames.print();
        System.out.print("Employee numbers: ");
        employeeNumbers.print();
        System.out.println();

        // add more employees

        employeeNames.add("Rebecca");
        employeeNumbers.add(10010102);
        employeeNames.add("Pierre");
        employeeNumbers.add(10010103);
        employeeNames.add("Luda");
        employeeNumbers.add(10010104);

        System.out.println("\nAdded further employees:");
        System.out.println();
        System.out.print("Employee names: ");
        employeeNames.print();
        System.out.print("Employee numbers: ");
        employeeNumbers.print();
        System.out.println();

    }

}