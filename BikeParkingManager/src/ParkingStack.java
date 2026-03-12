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
    
    public void push(Vehicle v){
        Node newNode = new Node(v);
        newNode.setNext(top); //link new node to the prev top node
        top = newNode; //update top node ref to new node
        size++;
    }
    
    public Vehicle pop(){
        if (top==null){
            return null;
        }
        
       Vehicle vehicle = (Vehicle) top.getElement(); //get the vehicle stored in the top node
        top = top.getNode(); //mode the top ref to the next node in stack
        size--;
        
        return vehicle;
    }
    
    public Vehicle peek(){
        if(top ==null){
            return null;
        }
        return (Vehicle) top.getElement();
    }
    
    public int size(){
        return size;
    }
    
}
