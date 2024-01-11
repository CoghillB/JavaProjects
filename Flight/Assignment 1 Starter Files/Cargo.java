/*File: Commercial.java
 * Author: Brayden Coghill
 * Student ID: 300347436
 * Date: October 2nd, 2018
 * Instructor: Ken
 * Description: This class is a subclass of Flight and is used to create Cargo flight listings.
 */

public class Cargo extends Flight {

    protected String freightDescription;

    public Cargo(String dl, String dest, Time dt, Time dur, String fd) {
        super(dl, dest, dt, dur);
        this.freightDescription = fd;
        this.flightNumber = flightNumber + "-C";
    }

    // accessors
    public String getFreightDescription() {
        return freightDescription;
    }

    public String getDepartLocation() {
        return super.getDepartLocation();
    }

    public String getDestination() {
        return super.getDestination();
    }

    public String getFlightNumber() {
        return super.getFlightNumber();
    }

    public Time getDepartTime() {
        return super.getDepartTime();
    }

    public Time getDuration() {
        return super.getDuration();
    }

    // mutators for departTime and freightDescription
    public void setDepartTime(Time t) {
        super.setDepartTime(t);
    }

    public void setFreightDescription(String freightDescription) {
        this.freightDescription = freightDescription;
    }

    // toString method
    public String toString() {
        return super.toString() + "Freight: " + freightDescription + "\n";
    }
}