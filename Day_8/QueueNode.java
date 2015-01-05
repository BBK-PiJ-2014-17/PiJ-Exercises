  public class QueueNode {

    private QueueNode next;
    private Object content;

    public QueueNode (Object content) {
        this.content = content;
        System.out.println(this.content);
        next = null;
    }

    public Object getContent() {
        return content;
    }

    public void setNext(QueueNode node) {
        next = node;
    }

    public QueueNode getNext() {
        return next;
    }

}