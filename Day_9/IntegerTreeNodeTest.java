public class IntegerTreeNodeTest {

    public static void main(String[] args) {

        IntegerTreeNode root = new IntegerTreeNode(6);

        System.out.println(root.getValue());

        root.add(9);
        root.add(5);
        root.add(11);
        root.add(3);
        root.add(8);
        root.add(12);
        root.add(-17);
        root.add(48);
        root.add(23);
        root.add(39);
        root.add(-8);
        root.add(13);

        System.out.println("Max: " + root.getMax());
        System.out.println("Min: " + root.getMin());

        System.out.println(root.toString());
        System.out.println(root.toStringSimplified());

        System.out.println(root.depth());

    }

}