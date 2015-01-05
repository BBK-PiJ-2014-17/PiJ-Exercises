public class PersonQueueImp implements PersonQueue {

    private Person head;
    private int length;

    public PersonQueueImp() {
        this.head = null;
        this.length = 0;
    }

    public void insert (Person i) {

        if (head == null) {
            head = i;
        } else {

            Person p = head;

            while(p.getNext() != null) {
                p = p.getNext();
            }

            p.setNext(i);

        }

    }

    public Person retrieve() {

        Person ret = head;

        head = head.getNext();

        return ret;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public void print() {

        if (head == null) {

            System.out.println("Empty Queue");

        } else {

            Person p = head;

            do {
                System.out.println(p.toString());
                p = p.getNext();
            } while (p != null);

        }

    }

}