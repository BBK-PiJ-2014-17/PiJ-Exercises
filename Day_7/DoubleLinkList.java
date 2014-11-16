public class DoubleLinkList {

    // variables

    private DoubleListElement listStart = null;
    private DoubleListElement listFinish = null;

    // constructor

    public DoubleLinkList() {

        // add first element

        DoubleListElement firstElement = new DoubleListElement(1);
        listStart = firstElement;
        listFinish = firstElement;

    }

    // main method

    public static void main(String[] args) {

        DoubleLinkList l = new DoubleLinkList();    //  create object
        l.start();  // start

    }

    private void start() {

        addElement(new DoubleListElement(22));
        addElement(new DoubleListElement(12));
        addElement(new DoubleListElement(1));
        addElement(new DoubleListElement(53));
        addElement(new DoubleListElement(4));
        addElement(new DoubleListElement(85));
        addElement(new DoubleListElement(16));
        addElement(new DoubleListElement(95));
        addElement(new DoubleListElement(96));
        addElement(new DoubleListElement(45));

        System.out.println("List has " + listStart.getElementCount() + " elements");
        System.out.println();
        System.out.println("FORWARDS");
        printListForwards(listStart);
        System.out.println();
        System.out.println("BACKWARDS");
        printListBackwards(listFinish);
        System.out.println();

        listStart.deleteListElement(85);
        listStart.deleteListElement(1);

        System.out.println();
        System.out.println("List has " + listStart.getElementCount() + " elements");
        System.out.println();
        System.out.println("FORWARDS");
        printListForwards(listStart);
        System.out.println();
        System.out.println("BACKWARDS");
        printListBackwards(listFinish);

        addElement(new DoubleListElement(100));
        listStart.deleteListElement(86);

        System.out.println();
        System.out.println("List has " + listStart.getElementCount() + " elements");
        System.out.println();
        System.out.println("FORWARDS");
        printListForwards(listStart);
        System.out.println();
        System.out.println("BACKWARDS");
        printListBackwards(listFinish);

    }

    private void addElement(DoubleListElement e) {

        listStart.addListElement(e);
        listFinish = e;

    }

    private void printListForwards(DoubleListElement e) {

        int i = e.getElementID();
        int j = (e.getNextElement() == null) ? -1 : e.getNextElement().getElementID();
        int k = (e.getLastElement() == null) ? -1 : e.getLastElement().getElementID();

        System.out.println("Element: " + i + " has next: " + j + " and last: " + k);

        if (e.getNextElement() == null) {
            //pass
        } else {
            printListForwards(e.getNextElement());
        }

    }

    private void printListBackwards(DoubleListElement e) {

        int i = e.getElementID();
        int j = (e.getNextElement() == null) ? -1 : e.getNextElement().getElementID();
        int k = (e.getLastElement() == null) ? -1 : e.getLastElement().getElementID();

        System.out.println("Element: " + i + " has next: " + j + " and last: " + k);

        if (e.getLastElement() == null) {
            //pass
        } else {
            printListBackwards(e.getLastElement());
        }

    }

}
