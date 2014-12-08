public class GenericDoubleLinkList<T> {

    // variables

    private Node listStart = null;
    private Node listFinish = null;

    // constructor

    public GenericDoubleLinkList() {

        // create head of list

        Node firstNode = new Node("HEAD");
        listStart = firstNode;
        listFinish = firstNode;

    }

    public void add(Node<T> n) {

        Node<T> current = listStart;

        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(n);

    }

    public boolean remove(Node<T> n) {

        Node<T> current = listStart;

        while (!current.getNextNode().equals(n)) {
            current = current.getNextNode();
        }

        if (current != null) {
            current.getPrevNode().setNextNode(current.getNextNode());
            current.getNextNode().setPrevNode(current.getPrevNode());
            return true;
        } else {
            System.out.println("Node not found");
            return false;
        }

    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        return sb.toString();

    }

    // node inner class

    private class Node<T> {

        // variables

        private T content;
        private Node<T> nextNode;
        private Node<T> prevNode;

        // getters and setters

        public T getContent() {
            return this.content;
        }

        public void setNextNode(Node<T> n) {
            nextNode = n;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setPrevNode(Node<T> n) {
            prevNode = n;
        }

        public Node getPrevNode() {
            return prevNode;
        }

        // constructors

        public Node(T content) {
            this(content, null, null);
        }

        public Node(T content, Node<T> nextNode, Node<T> prevNode) {
            this.content = content;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }

    }

}
