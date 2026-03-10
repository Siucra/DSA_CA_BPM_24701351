/**
 * ParkingStack.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public class ParkingStack {
    private Node top; //top node ref
    private int size;
    
    public ParkingStack(){//NULL CONSTRUCTOR
    }
    
    public void push(Bike b){
        Node newNode = new Node(b);
        newNode.setNext(top); //link new node to the prev top node
        top = newNode; //update top node ref to new node
        size++;
    }
    
    public Bike pop(){
        if (top==null){
            return null;
        }
        
        Bike bike = (Bike) top.getElement(); //get the bike stored in the top node
        top = top.getNode(); //mode the top ref to the next node in stack
        size--;
        
        return bike;
    }
    
    public Bike peek(){
        if(top ==null){
            return null;
        }
        return (Bike) top.getElement();
    }
    
}
