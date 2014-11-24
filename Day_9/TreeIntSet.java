public class TreeIntSet implements IntSet {

    private int value;
    private TreeIntSet left;
    private TreeIntSet right;

    public int getValue() {
        return value;
    }

    public TreeIntSet (int root) {
        this.value = root;
    }

    public void add (int addElement) {

        if (addElement > this.value) {
            if (right == null) {
                right = new TreeIntSet(addElement);
            } else {
                right.add(addElement);
            }
        } else if (addElement < this.value)  {
            if (left == null) {
                left = new TreeIntSet(addElement);
            } else {
                left.add(addElement);
            }
        } else {
            System.out.println("Element " + addElement + " already contained in set.");
        }

    }

    public boolean contains (int key) {

        if (key == this.value) {
            return true;
        } else if (key > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(key);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(key);
            }

        }

    }

    public boolean containsVerbose (int key) {

        if (key == this.value) {
            System.out.println("Contains key: " + this.value);
            return true;
        } else if (key > this.value) {
            System.out.println("Checked against key: " + this.value);
            if (right == null) {
                return false;
            } else {
                return right.contains(key);
            }
        } else {
            System.out.println("Checked against key: " + this.value);
            if (left == null) {
                return false;
            } else {
                return left.contains(key);
            }

        }

    }

    public String toString() {

        String output = "[";

        if (left == null && right == null) {
            return output + this.value + "]";
        } else {

            output = output + this.value + " ";

            if (left != null) {

                output = output + " " + left.toString();

            }

            if (right != null) {

                output = output + " " + right.toString();

            }

        }

        return output + "]";

    }

}