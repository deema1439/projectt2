public class NonSubscribers extends Passenger{
    private boolean discountCoupon;

    public NonSubscribers(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }


    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribers() {
    }

    public NonSubscribers(String name, String ID, Car reservedc, double tripCost,boolean discountCoupon) {
        super(name, ID, reservedc, tripCost);
        this.discountCoupon=discountCoupon;
    }


    @Override
    public void reserved(Car c) {
        carCapacityExeption(c);
        this.reservedc = c;
        double tripPrice = c.getFixedRoute().getTripPrice();
        if (discountCoupon) {
            this.tripCost = tripPrice - (tripPrice * 10 / 100);
            } else {
                this.tripCost = tripPrice;
            }
        c.setMaxCapacity(c.getMaxCapacity()-1);
        }



    @Override
    public void displayinfo() {
        System.out.println("The name: "+getName());
        System.out.println("The Id: "+getID());
        System.out.println("the Code of the car:  "+reservedc.getCode());
        System.out.println("Route price: "+reservedc.getFixedRoute().getTripPrice());
        System.out.println("Route cost: "+getTripCost());







    }








}
