public class Route {
    String pickupAddress;
    String destinationAddress;
    double tripPrice;

    public Route(String pickupAddress, String destinationAddress, double tripPrice){
        this.pickupAddress=pickupAddress;
        this.destinationAddress=destinationAddress;
        this.tripPrice=tripPrice;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }


}
