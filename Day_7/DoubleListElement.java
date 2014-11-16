public class DoubleListElement {

    // variables

    private static int elementCount = 0;
    private int elementID;
    private DoubleListElement nextElement;
    private DoubleListElement lastElement;

    // getters and setters

    public int getElementCount() {
        return elementCount;
    }

    public int getElementID() {
        return this.elementID;
    }

    public void setNextElement(DoubleListElement e) {
        nextElement = e;
    }

    public DoubleListElement getNextElement() {
        return nextElement;
    }

    public void setLastElement(DoubleListElement e) {
        lastElement = e;
    }

    public DoubleListElement getLastElement() {
        return lastElement;
    }

    // constructor

    public DoubleListElement(int elementID) {
        this.elementID = elementID;
        this.nextElement = null;
        this.lastElement = null;
        elementCount++;
    }

    // class methods

    public boolean addListElement(DoubleListElement e) {

        if (this.getNextElement() == null) {
            this.setNextElement(e);
            this.getNextElement().setLastElement(this);
            return true;
        } else {
            if(this.getNextElement().addListElement(e)) {
                System.out.println("Add last: " + this.getNextElement().getElementID() + ", " + this.getElementID());
                this.getNextElement().setLastElement(this);
            }
            return false;
        }

    }

    public boolean deleteListElement(int i) {

        if (this.getNextElement() == null) {
            System.out.println("Element not found");
            return false;
        } else if (this.getNextElement().getElementID() == i) {
            System.out.println("Deleting element " + this.getNextElement().getElementID());
            this.setNextElement(this.getNextElement().getNextElement());    //  re-link next ID
            this.getNextElement().setLastElement(this);    //  re-link last ID for next ID
            elementCount--;
            return true;
        } else {
            return this.getNextElement().deleteListElement(i);  // recursive loop through all elements
        }

    }

}