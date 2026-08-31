public class Car {
 private String code;
 private final Route fixedRoute;//خط مسار ثابت لهذي السياره او مثلا هذي الحافله
 private int maxCapacity;  //of passengers per trip;

    public Car(String code, Route fixedRoute, int maxCapacity) {
        this.code = code;
        this.fixedRoute = fixedRoute;//خارج الكلاس القيمه اسويها
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }









}
