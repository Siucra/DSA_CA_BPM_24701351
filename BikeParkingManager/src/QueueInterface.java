/**
 * QueueInterface.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public interface QueueInterface {
    void enqueue(Object e); // adds element to the end of the queue
    Object dequeue(); //remove and return the front element of the queue
    Object peek(); //look at the front element w/out removing it
    int size();
    boolean isEmpty();
    
}
