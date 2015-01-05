public class Supermarket {

    private PersonQueue aisle1;

    public Supermarket() {

    }

    public static void main(String[] args) {

        Supermarket s = new Supermarket();
        s.start();
    }

    private void start() {

    }

    public void addPerson(Person p) {

        aisle1.insert(p);

    }

    public void servePerson() {

        aisle1.retrieve();

    }

}