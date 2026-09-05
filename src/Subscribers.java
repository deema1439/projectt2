public class Subscribers extends Passenger{
    public Subscribers(String name, String ID, Car reservedc, double tripCost) {
        super(name, ID, reservedc, tripCost);
    }

    public Subscribers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void displayinfo() {
        System.out.println("The name of the passenger : "+getName());
        System.out.println("The Id : "+getID());
        System.out.println("The Car code: "+reservedc.getCode());
        System.out.println("Route price: "+reservedc.getFixedRoute().getTripPrice());
        System.out.println("The trip cost With Discount: "+getTripCost());

    }

    @Override
    public void reserved(Car c) {
        carCapacityExeption(c);
     this.reservedc=c;
     double tripPrice=c.getFixedRoute().getTripPrice();
     this.tripCost=tripPrice-(tripPrice*50/100);
     c.setMaxCapacity(c.getMaxCapacity()-1);

    }
}
