public class ListUtilitiesTest {

    public static void main(String[] args) {

        List l = new List(ListType.DOUBLE_CIRC);

        l.addItem(new ListItem(1, new Object(), l.getType()));
        l.addItem(new ListItem(2, new Object(), l.getType()));
        l.addItem(new ListItem(4, new Object(), l.getType()));
        l.addItem(new ListItem(6, new Object(), l.getType()));
        l.addItem(new ListItem(14, new Object(), l.getType()));


        l.print();
        l.removeItem(6);
        System.out.println();
        l.print();
        l.removeItem(1);
        System.out.println();
        l.print();
        l.removeItem(14);
        System.out.println();
        l.print();

    }


}