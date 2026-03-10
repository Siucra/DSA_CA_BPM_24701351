/**
 * ParkingListInterface.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public interface ParkingListInterface {
    
    boolean isEmpty();
    int size();
    void add(Object e, int index);
    Object get(int index);
    Object remove(Object e);
}
