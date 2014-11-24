public class SetImp {

    public static void main(String[] args) {

        IntSet root = new TreeIntSet(0);
        IntSet head = new ListIntSet(0);

        root.add(4);
        root.add(-3);

        System.out.println(root.toString());

        root.add(8);
        root.add(-3);

        System.out.println(root.toString());

        head.add(3);
        head.add(4);

        System.out.println(head.toString());

        head.add(4);

        System.out.println(head.toString());
    }

}