public class LinkedList {

    // variables

    private ListElement listStart = null;

    // constructor

    public LinkedList(){

        // add first element

        ListElement firstElement = new ListElement(34);
        listStart = firstElement;

    }

    // main method

    public static void main(String[] args) {

        LinkedList l = new LinkedList();    //  create object
        l.start();  // start

    }

    private void start() {

        System.out.println("Element ID: " + listStart.getElementID());

        listStart.addListElement(new ListElement(22));
        listStart.addListElement(new ListElement(12));
        listStart.addListElement(new ListElement(1));
        listStart.addListElement(new ListElement(53));
        listStart.addListElement(new ListElement(4));
        listStart.addListElement(new ListElement(85));
        listStart.addListElement(new ListElement(16));
        listStart.addListElement(new ListElement(95));
        listStart.addListElement(new ListElement(96));
        listStart.addListElement(new ListElement(45));

        printList();

    }

    private void printList() {

        System.out.println("List has " + listStart.getElementCount() + " elements");

        printListElement(listStart);

    }

    private String printListElement(ListElement e) {

        if (e.getNextElement() == null) {
            return "Element: " + e.getElementID();
        } else {
            System.out.println(printListElement(e.getNextElement()));
            return "Element: " + e.getElementID();
        }

    }

}