/**
 * Node.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public class Node {
    private Object element;
    private Node next;

    public Node() {
        next = null;
        element = null;
    }

    public Node(Object element) {
        this.element = element;
        this.next = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
