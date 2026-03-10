/**
 * ParkingStack.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public class WaitingListQueue {//FIFO
    private Node front; //first node ref
    private Node rear;  //last node ref
    private int size;
    
    public WaitingListQueue(){//NULL CONSTRUCTOR
    }
    
    public int size(){
        return size;
    }
    
    public void enqueue (Object e){
        Node newNode = new Node(e);
        if(rear==null){
            front = rear = newNode; //new node becomes both front and rear
        }
        else{
            rear.setNext(newNode);
            rear = newNode; /// Update rear reference to the new node
        }
        size++;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
        
    public Object dequeue(){
        if(isEmpty()){
            return null;
        }
        Object data = front.getElement();
        front = front.getNode(); // Move front reference to the next node in the list
        
        if(front ==null){
            rear = null;
        }
        size--;
        return data; // Return the removed element
    }
    
    public Object peek(){
        if(isEmpty()){
            return null;
        }
        return front.getElement();
    }    
}
