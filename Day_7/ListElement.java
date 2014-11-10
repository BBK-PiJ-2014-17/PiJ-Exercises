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

    public void deleteListElement() {


    }

}