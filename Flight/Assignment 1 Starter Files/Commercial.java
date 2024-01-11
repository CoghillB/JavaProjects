/*File: Commercial.java
 * Author: Brayden Coghill
 * Student ID: 300347436
 * Date: October 2nd, 2018
 * Instructor: Ken
 * Description: This class is a subclass of Flight and is used to create Commercial flight listings.
 */

public class Commercial extends Flight {
// instance variables are protected so they can be accessed by subclasses
    protected String status;
    protected double securityFee;

    // if s == null return "On Time"
    public Commercial(String dl, String dest, Time dt, Time dur, String s, double sf) {
        super(dl, dest, dt, dur);
        if (s == null) {
            status = "On Time";
        } else {
            status = s;
        }
        this.securityFee = sf;
    }

    // accessors
    public String departLocation() {
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

    // if status is null return "On Time"
    public String getStatus() {
        if (status == null) {
            return "On Time";
        } else {
            return status;
        }
    }

    public double getSecurityFee() {
        return securityFee;
    }

    // mutators for departTime, duration, status
    public void setDepartTime(Time t) {
        super.setDepartTime(t);
    }

    public void setDuration(Time t) {
        super.setDuration(t);
    }

    public void setStatus(String s) {
        status = s;
    }

    // toString Method
    public String toString() {
        return super.toString() + "Status: " + status + "\n";
    }
}