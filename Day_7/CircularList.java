public class CircularList {

    // variables

    private ListElement listStart = null;

    // constructor

    public CircularList() {

        // add first element

        ListElement firstElement = new ListElement(34);
        listStart = firstElement;

    }

    // main method

    public static void main(String[] args) {

        CircularList l = new CircularList();    //  create object
        l.start();  // start

    }

    private void start() {

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

        completeCircle(listStart);

        printList();
        System.out.println();

        removeElement(85);

        System.out.println();
        printList();
        System.out.println();

        removeElement(34);  // first

        System.out.println();
        printList();
        System.out.println();

        removeElement(100);  // first
        addElement(new ListElement(99));

        System.out.println();
        printList();
        System.out.println();

    }

    private void addElement(ListElement e) {

        listStart.addListElement(e, listStart);
        completeCircle(listStart);

    }

    private void removeElement(int i) {

        if (listStart.getElementID() == i) {

            listStart = listStart.getNextElement();

        } else {

            listStart.deleteListElement(i, listStart);

        }

    }

    private void printList() {

        System.out.println("List has " + listStart.getElementCount() + " elements");

        printListElement(listStart);

    }

    private void printListElement(ListElement e) {

        int i = e.getElementID();
        int j = (e.getNextElement() == null) ? -1 : e.getNextElement().getElementID();

        System.out.println("Element: " + i + " has next: " + j);

        if (e.getNextElement() == listStart) {
            //pass
        } else {
            printListElement(e.getNextElement());
        }

    }

    private void completeCircle(ListElement e) {

        if (e.getNextElement() == null) {
            e.setNextElement(listStart);
        } else {
            completeCircle(e.getNextElement());
        }

    }

}