public class ListElement {

    // variables

    private static int elementCount = 0;
    private int elementID;
    private ListElement nextElement;

    // getters and setters

    public int getElementCount() {
        return elementCount;
    }

    public int getElementID() {
        return this.elementID;
    }

    public void setNextElement(ListElement e) {
        nextElement = e;
    }

    public ListElement getNextElement() {
        return nextElement;
    }

    // constructor

    public ListElement(int elementID) {
        this.elementID = elementID;
        this.nextElement = null;
        elementCount++;
    }

    // class methods

    public void addListElement(ListElement e) {

        if (this.getNextElement() == null) {
            this.setNextElement(e);
        } else {
            this.getNextElement().addListElement(e);
        }

    }

    public void addListElement(ListElement e, ListElement s) {    //  for circular lists

        if (this.getNextElement() == s) {
            this.setNextElement(e);
        } else {
            this.getNextElement().addListElement(e, s);
        }

    }

    public boolean deleteListElement(int i) {

        if (this.getNextElement() == null) {
            System.out.println("Element not found");
            return false;
        } else if (this.getNextElement().getElementID() == i) {
            System.out.println("Deleting element " + this.getNextElement().getElementID());
            this.setNextElement(this.getNextElement().getNextElement());
            elementCount--;
            return true;
        } else {
            return this.getNextElement().deleteListElement(i);  // recursive loop through all elements
        }

    }

    public boolean deleteListElement(int i, ListElement e) {    //  for circular lists

        if (this.getNextElement() == e) {
            System.out.println("Element not found");
            return false;
        } else if (this.getNextElement().getElementID() == i) {
            System.out.println("Deleting element " + this.getNextElement().getElementID());
            this.setNextElement(this.getNextElement().getNextElement());
            elementCount--;
            return true;
        } else {
            return this.getNextElement().deleteListElement(i, e);  // recursive loop through all elements
        }

    }

}