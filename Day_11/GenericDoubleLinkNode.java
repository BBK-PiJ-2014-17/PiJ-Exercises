public class GenericDoubleLinkNode<T> {

    // variables

    private static int listLength = 0;
    private T content;
    private GenericDoubleLinkNode nextNode;
    private GenericDoubleLinkNode prevNode;

    // getters and setters

    public int getListLength() {
        return listLength;
    }

    public T getContent() {
        return this.content;
    }

    public void setNextNode(GenericDoubleLinkNode node) {
        nextNode = node;
    }

    public GenericDoubleLinkNode getNextNode() {
        return nextNode;
    }

    public void setPrevNode(GenericDoubleLinkNode node) {
        prevNode = node;
    }

    public GenericDoubleLinkNode getPrevNode() {
        return prevNode;
    }

    // constructor

    public GenericDoubleLinkNode(T content) {
        this.content = content;
        this.nextNode = null;
        this.prevNode = null;
        listLength++;
    }

    // class methods

    public boolean addListNode(GenericDoubleLinkNode node) {

        if (nextNode == null) {
            setNextNode(node);
            nextNode.setPrevNode(this);
            return true;
        } else {
            if(nextNode.addListNode(node)) {
                nextNode.setPrevNode(this);
            }
            return false;
        }

    }

    public boolean deleteListNode(GenericDoubleLinkNode node) {

		/*
	
        if (nextNode == null) {
            System.out.println("Element not found");
            return false;
        } else if (nextNode.equals(node)) {
            setNextNode(nextNode.nextNode);    	//  re-link next ID
            nextNode.setprevNode(this);    		//  re-link last ID for next ID
            listLength--;
            return true;
        } else { 
            return nextNode.deleteListNode(i);  // recursive loop through all elements
        }

		*/
		
		return true;
		
    }

}