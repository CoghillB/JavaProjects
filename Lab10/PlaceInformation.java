/*
 * Brayden Coghill
 * 300347436
 * November 22, 2023
 * Sarah Foss
 * 
 * This class stores information about a location on Earth.  Locations are specified using latitude and longitude. 
 * The class includes two methods for computing the distance between two locations.
 * 
 */

public class PlaceInformation {
    private String name;
    private String address;
    private String tag;
    private double latitude;
    private double longitude;

    // constructor for a PlaceInformation object with given name, address, tag,
    // latitude and longitude
    public PlaceInformation(String name, String address, String tag, double latitude, double longitude) {
        this.name = name;
        this.address = address;
        this.tag = tag;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // returns the name of this PlaceInformation
    public String getName() {
        return name;
    }

    // returns the address of this PlaceInformation
    public String getAddress() {
        return address;
    }

    // returns the tag of this PlaceInformation
    public String getTag() {
        return tag;
    }

    // returns the latitude of this PlaceInformation
    public double getLatitude() {
        return latitude;
    }

    // returns the longitude of this PlaceInformation
    public double getLongitude() {
        return longitude;
    }

    // returns a string representation of this PlaceInformation
    public String toString() {
        return name + " (" + tag + "): " + address + " (" + latitude + ", " + longitude + ")";
    }

    // returns the location of this PlaceInformation
    public GeoLocation getLocation() {
        return new GeoLocation(latitude, longitude);
    }

    // returns the distance in kilometers between this PlaceInformation and the
    // given other PlaceInformation
    public double distanceKilometers(GeoLocation spot) {
        return getLocation().distanceKilometers(spot);
    }

    // returns the distance in miles between this PlaceInformation and the given
    // other PlaceInformation
    public double distanceMiles(GeoLocation spot) {
        return getLocation().distanceMiles(spot);
    }
}
