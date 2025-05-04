package Taxi;

public class Taxi implements Cloneable {
    private int customerId;
    private int taxiId;
    private char currentLocation='A';
    private char pickUpLocation;
    private char dropLocation;
    private int pickUpTime;
    private int dropTime;
    private int earnings;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(char pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public char getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }

    public char getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(char dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public int getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
    @Override
    public String toString()
    {
        return "Taxi "+getTaxiId()+"\nCurrentLocation="+currentLocation+"\ncustomerId="+customerId+
                "\npickUpLocation="+pickUpLocation+"\ndropLocation="+dropLocation+"\npickUpTime"+pickUpTime+"\ndropTime="+dropTime+
                "\nearnings="+earnings;
    }

}
