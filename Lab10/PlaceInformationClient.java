
/**
 * This program constructs several PlaceInformation objects and prints
 * information about them and the distances between them and two locations
 * (London and Seattle).  It is intended to be used to test whether the
 * PlaceInformation class is implemented correctly.
 */

public class PlaceInformationClient {
    public static void main(String[] args) {
        PlaceInformation[] data =
            {new PlaceInformation("Kelowna Sails", "Abbott St.",
                                  "tourist", 49.886995733329094, -119.49713568078042),
             new PlaceInformation("Knox Mountain Park", "450 Knox Mountain Park",
                                  "park", 49.9141074485861, -119.48270695069532),
             new PlaceInformation("Okanagan College", "1000 KLO Rd",
                                  "college, post-secondary institution", 49.86211335351182, -119.48112117363422)};

        GeoLocation london = new GeoLocation(51.49753887465955, -0.13184879200640295);
        GeoLocation seattle = new GeoLocation(47.60647291072803, -122.32437288921842);

        for (PlaceInformation info : data) {
            System.out.println("name\t\t: " + info.getName());
            System.out.println("address\t\t: " + info.getAddress());
            System.out.println("tags\t\t: " + info.getTag());
            System.out.println("location\t: " + info);
            System.out.println("London (kms)\t: " + info.distanceKilometers(london));
            System.out.println("Seattle (miles)\t: " + info.distanceMiles(seattle));
            System.out.println();
        }
    }
}