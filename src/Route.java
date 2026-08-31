public class Route {
   private String StartPickUpAddress,destinationAddress;// عنوان الوصول
   private double tripPrice;//only trip price.

    public Route() {
    }

    public Route(String startPickUpAddress, String destinationAddress, double tripPrice) {
        StartPickUpAddress = startPickUpAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getStartPickUpAddress() {
        return StartPickUpAddress;
    }

    public void setStartPickUpAddress(String startPickUpAddress) {
        StartPickUpAddress = startPickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }






























}
