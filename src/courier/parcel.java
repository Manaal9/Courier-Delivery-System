package courier;

public class parcel {

    private int parcelId;
    private int customerId;
    private String destination;
    private String parcelType;
    private double weight;
    private int priority;

    public parcel(int parcelId, int customerId,
                  String destination,
                  String parcelType,
                  double weight,
                  int priority) {

        this.parcelId = parcelId;
        this.customerId = customerId;
        this.destination = destination;
        this.parcelType = parcelType;
        this.weight = weight;
        this.priority = priority;
    }

    public int getParcelId() {
        return parcelId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getDestination() {
        return destination;
    }

    public String getParcelType() {
        return parcelType;
    }

    public double getWeight() {
        return weight;
    }

    public int getPriority() {
        return priority;
    }

    public void displayParcel() {

        System.out.println("Parcel ID      : " + parcelId);
        System.out.println("Customer ID    : " + customerId);
        System.out.println("Destination    : " + destination);
        System.out.println("Parcel Type    : " + parcelType);
        System.out.println("Weight         : " + weight + " kg");
        System.out.println("Priority       : " + priority);
    }
}