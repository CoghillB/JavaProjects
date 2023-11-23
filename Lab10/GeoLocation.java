/**
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes two methods for
 * computing the distance between two locations.
 *
 */
public class GeoLocation {
    public static final double RADIUS_KM = 6371.01;  // Earth radius in kilometers
    public static final double RADIUS_MILES = 3958.7558657;  // Earth radius in miles
    private double latitude;
    private double longitude;

    /**
     * Constructor for a GeoLocation object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude) {
        latitude = theLatitude;
        longitude = theLongitude;
    }
    

    /**
     * Returns the latitude of this GeoLocation
     */
    public double getLatitude() {
        return latitude;
    }

    
    /**
     * Returns the longitude of this GeoLocation
     */
    public double getLongitude() {
        return longitude;
    }

   
    /**
     * Returns a string representation of this GeoLocation
     */
    public String toString() {
        return "latitude: " + latitude + ", longitude: " + longitude;
    }

    // 
    /**
     * Returns the distance in kilometers between this GeoLocation and the given other GeoLocation
     */
    public double distanceKilometers(GeoLocation other) {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS_KM;
        
    }
    
    /**
     * Returns the distance in miles between this GeoLocation and the given other GeoLocation
     */
    public double distanceMiles(GeoLocation other) {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS_MILES;
    }
}
