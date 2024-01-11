/*File: Commercial.java
 * Author: Brayden Coghill
 * Student ID: 300347436
 * Date: October 2nd, 2018
 * Instructor: Ken
 * Description: This class is a subclass of Commercial and is used to create Domestic flight listings.
 */

public class Domestic extends Commercial {

    protected double airportFee;

    // add "-D" to the flight number in the constructor
    public Domestic(String dl, String dest, Time dt, Time dur, double sf, double af) {
        super(dl, dest, dt, dur, dest, sf);
        this.airportFee = af;
        this.flightNumber = flightNumber + "-D";
    }

    // qccessors
    public String getDepartmentLocation() {
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

    public String getStatus() {
        return super.getStatus();
    }

    public double getSecurityFee() {
        return super.getSecurityFee();
    }

    public double getAirportFee() {
        return airportFee;
    }

    // mutators for departTime, duration, status
    public void setDepartTime(Time t) {
        super.setDepartTime(t);
    }

    public void setDuration(Time t) {
        super.setDuration(t);
    }

    public void setStatus(String s) {
        super.setStatus(s);
    }

    // toString Method
    public String toString() {
        return super.toString();
    }
}