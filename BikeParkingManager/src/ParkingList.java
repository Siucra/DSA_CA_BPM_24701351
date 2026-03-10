/**
 * ParkingList.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public class ParkingList implements ParkingListInterface {

    private Node head;
    private Node cur;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Object e, int index) {
        Node newNode = new Node(e);
        
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } 
        else {
            cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.getNode();
            }
            newNode.setNext(cur.getNode());
            cur.setNext(newNode);
        }
        size++;
    }
    
    public Object get(int index) {
        cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.getNode();
        }

        return cur.getElement();
    }

    public Object remove(Object e) {
        Node prev = null;
        cur = head;
        while (cur != null) {
            if (cur.getElement().equals(e)) {
                if (prev == null) {
                    head = cur.getNode();
                } 
                else {
                    prev.setNext(cur.getNode());
                }
                size--;
                return cur.getElement();
            }
            prev = cur;
            cur = cur.getNode();
        }
        return null;
    }
}
