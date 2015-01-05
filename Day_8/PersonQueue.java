public interface PersonQueue {
    /**
     *  Adds another person to the queue.
     */
    void insert(Person person);

    /**
     *  Removes a person from the queue.
     */
    Person retrieve();

    /**
     *  True is queue is empty.
     */
    boolean isEmpty();

    /**
     *  Print method.
     */
    void print();

}