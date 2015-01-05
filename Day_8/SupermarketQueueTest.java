public class SupermarketQueueTest {

    public static void main(String[] args) {

        PersonQueue q = new SupermarketQueue(1);

        q.insert(new Person("Basil", "Mason", 29));

        q.print();


        //q.insert(new Person("Rebecca", "White", 29));

        /*
        boolean b = true;

        while (b) {

            Person p = q.retrieve();

            if (p == null) {
                b = false;
            } else {
                System.out.println(p.firstName);
            }

        }
            */
    }

}