
/**
 *
 * @author 05den
 */
public class ElectricBike extends Bike {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "Electric Bike id: " + getBikeId() + 
               ", Owner: " + ownerName +
               ", Battery: " + batteryLevel + "%";
    }
    
}
