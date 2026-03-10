/**
 * Bike.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public class Bike {
    private int bikeId;
    private String ownerName;

   // public Bike() {//NULL CONSTRUCTOR
    //}

    //public Bike(int bikeId, String ownerName) {
      //  this.bikeId = bikeId;
        //this.ownerName = ownerName;
    //}

    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public String toString(){
    return "Bike id: "+bikeId+", Owner name: "+ownerName;
    }
    
    
}
