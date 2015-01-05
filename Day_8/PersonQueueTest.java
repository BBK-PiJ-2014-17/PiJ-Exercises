public class PersonQueueTest {

    public static void main(String[] args) {

        PersonQueue q = new PersonQueueImp();

        q.insert(new Person("Basil", "Mason", 29));
        q.insert(new Person("Rebecca", "White", 29));
        q.insert(new Person("Andres", "Casais", 26));
        q.insert(new Person("Lizzie", "Beadon", 24));
        q.print();

        System.out.println();
        System.out.println("Retrieving: " + q.retrieve().toString());
        System.out.println("New queue");
        q.print();

        System.out.println();
        System.out.println("Retrieving: " + q.retrieve().toString());
        System.out.println("Retrieving: " + q.retrieve().toString());
        System.out.println("Retrieving: " + q.retrieve().toString());
        System.out.println("New queue");
        q.print();

    }


}