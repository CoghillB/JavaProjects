/*File: Commercial.java
 * Author: Brayden Coghill
 * Student ID: 300347436
 * Date: October 2nd, 2018
 * Instructor: Ken
 * Description: This class is a subclass of Commercial and is used to create International flight listings.
 */

public class International extends Commercial {

    protected String country;

    public International(String d1, String d2, Time t1, Time t2, String s, double sf, String c) {
        super(d1, d2, t1, t2, s, sf);
        this.country = c;
        this.flightNumber = flightNumber + "-I";
    }

    // accessors for all
    public String getdepartLocation() {
        return super.getDepartLocation();
    }

    public String getDestination() {
        return super.getDestination();
    }

    // add -I to the flight number
    public String getFlightNumber() {
        return super.getFlightNumber() + "-I";
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

    public String getCountry() {
        return country;
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

    // toString method
    public String toString() {
        return super.toString() + "Country: " + country + "\n";
    }
}