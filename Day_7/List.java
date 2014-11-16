public class List {

    private ListItem listStart = null;
    private ListItem listFinish = null;
    private ListType type;

    public ListType getType() {
        return type;
    }

    public ListItem getListFinish() {
        return listFinish;
    }

    public ListItem getListStart() {
        return listStart;
    }

    public List (ListType type) {
        this.type = type;
    }

    public List (ListType type, ListItem start) {
        this.type = type;
        this.listStart = start;
    }

    public void addItem(ListItem item) {

        if (listStart == null) {
            listStart = item;
        } else {
            listStart.addListItem(item, listStart);
        }

        if (type == ListType.SINGLE_CIRC || type == ListType.DOUBLE_CIRC)
            completeCircle(listStart);

    }

    public void removeItem(int item) {

        if (listStart.getIdentifier() == item) {
            listStart = listStart.getNextElement();
        } else {
            listStart.deleteListItem(item, listStart);
        }

    }

    private void completeCircle(ListItem e) {

        if (e.getNextElement() == null) {
            e.setNextElement(listStart);
        } else {
            completeCircle(e.getNextElement());
        }

    }

    public void print() {
        printList(listStart);
    }

    private void printList(ListItem start) {

        int i = start.getIdentifier();
        int j = (start.getNextElement() == null) ? -1 : start.getNextElement().getIdentifier();
        int k = (start.getPrevElement() == null) ? -1 : start.getPrevElement().getIdentifier();

        System.out.println("Element: " + i + " has next: " + j + " and prev: " + k);
        //System.out.println("Element: " + i + " has next: " + j);

        if (start.getNextElement() == null) {
            //pass
        } else {
            printList(start.getNextElement());
        }

    }

}