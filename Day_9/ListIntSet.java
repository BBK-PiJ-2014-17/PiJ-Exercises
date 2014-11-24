public class ListIntSet implements IntSet {

    private int value;
    private ListIntSet next;

    public ListIntSet (int head) {
        this.value = head;
    }

    public void add(int key) {

        if (key == this.value) {
            System.out.println("Element already added");
        } else {
            if (next == null) {
                next = new ListIntSet(key);
            } else {
                next.add(key);
            }
        }

    }

    public boolean contains(int key) {

        if (next == null) {
            System.out.println("Key not found");
            return false;
        } else if (next.value == key) {
            return true;
        } else {
            return next.contains(key);
        }

    }

    public boolean containsVerbose(int key) {

        if (next == null) {
            System.out.println("Key not found");
            return false;
        } else if (next.value == key) {
            return true;
        } else {
            return next.contains(key);
        }

    }

    public String toString() {

        String output = "";

        if (next == null) {
            return "" + this.value;
        } else {
            return this.value + " " + next.toString();
        }

    }

}