public class SupermarketQueue implements PersonQueue {

    private int aisle, queueLength;
    private QueueNode head;

    public SupermarketQueue (int aisle) {
        this.aisle = aisle;
        queueLength = 0;
        head = null;
    }

    public void insert (Person person) {

        Person h;

        if (head != null) {
            h = (Person) head.getContent();
            System.out.println(h);
        }

        System.out.println(person);
        QueueNode p = new QueueNode(person);
        QueueNode n = null;
        queueLength++;

        if (head == null) {

            head = p;

        } else {

            n = head;

            while (n.getNext() != null) {
                n = n.getNext();
            }

            n.setNext(p);

        }

    }

    public Person retrieve () {

        QueueNode n = head;
        QueueNode prev = head;

        while (n.getNext() != null) {

            n = n.getNext();
        }

        return (Person) n.getContent();
    }

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public void print() {

        boolean print = true;

        QueueNode n = head;

        while(print && head != null) {

            Person p = (Person) n.getContent();

            System.out.println(p);

            System.out.println(p.firstName);

            n = n.getNext();

        }

    }

}