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

        listStart.deleteListElement(85);
        listStart.deleteListElement(1);

        printList();

        System.out.println("List Count recursively:\t\t" + getListLengthRecursively(listStart));
        System.out.println("List Count iteratively:\t\t" + getListLengthIteratively());
        System.out.println("List Count from class variable:\t" + listStart.getElementCount());

    }

    private void printList() {

        System.out.println("List has " + listStart.getElementCount() + " elements");

        printListElement(listStart);

    }

    private void printListElement(ListElement e) {

        System.out.println("Element: " + e.getElementID());

        if (e.getNextElement() == null) {
            //pass
        } else {
            printListElement(e.getNextElement());
        }

    }

    // list lengths (Ex 4)

    private int getListLengthRecursively(ListElement e) {

        int count = 0;

        if (e.getNextElement() == null) {
            count = 1;
        } else {
            count++;
            count += getListLengthRecursively(e.getNextElement());
        }

        return count;

    }

    private int getListLengthIteratively() {

        int count = 1;

        ListElement current = listStart;

        while (current.getNextElement() != null) {

            count++;
            current = current.getNextElement();

        }

        return count;

    }

}