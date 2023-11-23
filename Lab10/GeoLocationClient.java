public class GeoLocationClient {
    public static void main(String[] args) {
        GeoLocation theStash = new GeoLocation(34.988889, -106.614444);
        GeoLocation abqStudio = new GeoLocation(34.989978, -106.614357);
        GeoLocation fbiBuilding = new GeoLocation(35.131281, -106.61263);

        System.out.println("The Stash is at " + theStash.toString());
        System.out.println("ABQ studio is at " + abqStudio.toString());
        System.out.println("FBI building is at " + fbiBuilding.toString());
        System.out.printf("The distance in kilometers between: \n Stash/Studio = %.17f \n Stash/FBI = %.15f \n",
                theStash.distanceKilometers(abqStudio), theStash.distanceKilometers(fbiBuilding));
        System.out.println();
        System.out.printf("The distance in miles between: \n Stash/Studio = %.17f\n",
                theStash.distanceMiles(abqStudio));
        System.out.printf(" Stash/FBI = %.15f\n", theStash.distanceMiles(fbiBuilding));
    }
}