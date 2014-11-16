public class ListItem {

    private int identifier;                     // list item identifier
    private ListItem nextElement = null;        // pointer to next element in list
    private ListItem prevElement = null;        // pointer to previous element in list
    private Object data;                        // list item data
    private ListType type;                       // list type

    ListItem (int identifier, Object data, ListType type) {
        this.identifier = identifier;
        this.data = data;
        this.type = type;
    }

    public int getIdentifier() {
        return identifier;
    }

    public ListItem getNextElement() {
        return nextElement;
    }

    public ListItem getPrevElement() {
        return prevElement;
    }

    public ListType getType() {
        return type;
    }

    public Object getData() {
        return data;
    }

    private void setIdentifier(int identifier) {    // not public
        this.identifier = identifier;
    }

    public void setNextElement(ListItem nextElement) {
        this.nextElement = nextElement;
    }

    public void setPrevElement(ListItem prevElement) {
        this.prevElement = prevElement;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setType(ListType type) {
        this.type = type;
    }

    public boolean addListItem(ListItem item, ListItem start) {

        ListType lt = item.type;

        if (this.type != item.type) {
            System.out.println(lt + " is an invalid ListItem for ListType " + this.type);
            return false;
        } else {

            ListItem tmp = (lt == ListType.SINGLE_CIRC || lt == ListType.DOUBLE_CIRC) ? start : null;

            if (this.nextElement == tmp) {
                this.setNextElement(item);
                if (lt == ListType.DOUBLE || lt == ListType.DOUBLE_CIRC)
                    this.nextElement.setPrevElement(this);
                return true;
            } else {
                if(this.nextElement.addListItem(item, start) && (lt == ListType.DOUBLE || lt == ListType.DOUBLE_CIRC)) {
                    this.nextElement.setPrevElement(this);
                }
                return false;
            }
        }

    }

    public boolean deleteListItem(int identifier, ListItem start) {

        ListType lt = start.type;

        ListItem tmp = (lt == ListType.SINGLE_CIRC || lt == ListType.DOUBLE_CIRC) ? start : null;

        if (this.nextElement == tmp) {
            System.out.println("Element not found");
            return false;
        } else if (this.nextElement.identifier == identifier) {
            System.out.println("Deleting element " + this.nextElement.identifier);
            this.setNextElement(this.nextElement.nextElement);
            if (lt == ListType.DOUBLE || lt == ListType.DOUBLE_CIRC)
                this.nextElement.setPrevElement(this);
            return true;
        } else {
            return this.nextElement.deleteListItem(identifier, start);  // recursive loop through all elements
        }

    }

}