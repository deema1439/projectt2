import java.util.ArrayList;
import java.util.List;

public class Main1 {
public static void main(String[] args) {

    List<Passenger>listofpassengers=new ArrayList<>();
    List <Car>carList=new ArrayList<>();
    Route r=new Route("Taif","Riyadh",200);
    r.setStartPickUpAddress("taif");
    r.setDestinationAddress("Riyadh");
    r.setTripPrice(200);
    Route r2=new Route("Jeddah","Makkah",50);
    r2.setStartPickUpAddress("Jeddah");
    r2.setDestinationAddress("Makkah");
    r2.setTripPrice(50);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    Car c=new Car("ABC123",r,5);
    Car c1=new Car("DEE112",r2,0);
    Subscribers s=new Subscribers("Deema","1122099938");
    NonSubscribers n=new NonSubscribers("Sara","1120909090",true);
    listofpassengers.add(s);
    listofpassengers.add(n);
    carList.add(c);
    carList.add(c1);
    for(int i=0;i<listofpassengers.size();i++){
        Passenger p= listofpassengers.get(i);
        Car c2=carList.get(i);
        p.reserved(c2);
        p.displayinfo();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }




































































































































































}














































































































}
