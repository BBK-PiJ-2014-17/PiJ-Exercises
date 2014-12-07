public class GenericDoubleLinkList {

    // variables

    private GenericDoubleLinkNode listStart = null;
    private GenericDoubleLinkNode listFinish = null;

    // constructor

    public GenericDoubleLinkList() {

        // add first element

        GenericDoubleLinkNode firstNode = new GenericDoubleLinkNode();
        listStart = firstNode;
        listFinish = firstNode;

    }

    // main method

    public static void main(String[] args) {

        GenericDoubleLinkList l = new GenericDoubleLinkList();    //  create object
        l.start();  // start

    }

    private void start() {

		

    }

    private void addNode(GenericDoubleLinkNode node) {

        listStart.addListNode(node);
        listFinish = node;

    }

    private void printListForwards(GenericDoubleLinkNode e) {

	
		/*
        int i = e.getElementID();
        int j = (e.getNextElement() == null) ? -1 : e.getNextElement().getElementID();
        int k = (e.getLastElement() == null) ? -1 : e.getLastElement().getElementID();

        System.out.println("Element: " + i + " has next: " + j + " and last: " + k);

        if (e.getNextElement() == null) {
            //pass
        } else {
            printListForwards(e.getNextElement());
        } */

    }

    private void printListBackwards(GenericDoubleLinkNode e) {

		/*
        int i = e.getElementID();
        int j = (e.getNextElement() == null) ? -1 : e.getNextElement().getElementID();
        int k = (e.getLastElement() == null) ? -1 : e.getLastElement().getElementID();

        System.out.println("Element: " + i + " has next: " + j + " and last: " + k);

        if (e.getLastElement() == null) {
            //pass
        } else {
            printListBackwards(e.getLastElement());
        } */

    }

}
