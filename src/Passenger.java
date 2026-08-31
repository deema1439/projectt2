public abstract class Passenger {
 protected String name,ID;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Passenger() {
    }

    protected Car reservedc;//السياره المحجوزه
 protected double tripCost; //تكلفة الرحله الكليه ككل

    public Passenger(String name, String ID, Car reservedc, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedc = reservedc;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedc() {
        return reservedc;
    }

    public void setReservedc(Car reservedc) {
        this.reservedc = reservedc;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }
    protected void carCapacityExeption(Car c){
        if (c.getMaxCapacity() == 0) {
            throw new IllegalArgumentException("Sorry you can't reserve the car capacity is 0");
        }
    }

    public abstract void reserved(Car c);
    public abstract void displayinfo();








































}
