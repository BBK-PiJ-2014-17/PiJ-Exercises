public class IntegerTreeNode {

    private int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    public int getValue() {
        return value;
    }

    public IntegerTreeNode (int value) {
        this.value = value;
    }

    public void add (int addElement) {

        if (addElement > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(addElement);
            } else {
                right.add(addElement);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(addElement);
            } else {
                left.add(addElement);
            }
        }

    }

    public boolean contains (int containsElement) {

        if (containsElement == this.value) {
            return true;
        } else if (containsElement > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(containsElement);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(containsElement);
            }

        }

    }

    public int getMax() {

        int max = this.value;

        if (right == null) {
            return max;
        } else {
            return (right.getMax());
        }

    }

    public int getMin() {

        int min = this.value;

        if (left == null) {
            return min;
        } else {
            return (left.getMin());
        }

    }

    public String toString() {

        String output = "";

        if (left == null && right == null) {
            return output + this.value + " L[] R[]";
        } else {

            output = output + " " + this.value + " ";

            if (left != null) {

                output = output + " L[" + left.toString() + "]";

            } else {

                output = output + " L[]";

            }

            if (right != null) {

                output = output + " R[" + right.toString() + "]";

            } else {

                output = output + " R[]";

            }

        }

        return output;

    }

    public String toStringSimplified() {

        String output = "";

        if (left == null && right == null) {
            return output + this.value;
        } else {

            output = output + " " + this.value + " ";

            if (left != null) {

                output = output + "[" + left.toStringSimplified() + "]";

            }

            if (right != null) {

                output = output + "[" + right.toStringSimplified() + "]";

            }

        }

        return output;

    }

    public int depth() {

        int leftCount = 1;
        int rightCount = 1;

        if (left == null && right == null) {
            return 1;
        } else {

            if (left != null) {

                leftCount += this.left.depth();

            }

            if (right != null) {

                rightCount += this.right.depth();

            }

            return (leftCount > rightCount) ? leftCount : rightCount;

        }

    }

}