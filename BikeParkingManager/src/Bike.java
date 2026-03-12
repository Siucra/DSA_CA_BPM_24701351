/**
 * Bike.java
 * 10/03/2026
 * @author DENISE BALASMEH
 * x24701351
 */

public class Bike extends Vehicle{
    private String bikeId;

   // public Bike() {//NULL CONSTRUCTOR
    //}

    //public Bike(int bikeId, String ownerName) {
      //  this.bikeId = bikeId;
        //this.ownerName = ownerName;
    //}

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }
    
    public String toString(){
    return "Bike id: "+bikeId+", Owner name: "+ownerName;
    }
    
    
}
