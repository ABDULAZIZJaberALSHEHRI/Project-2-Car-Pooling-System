public class Car {

    String code;
    Route fixedRoute;
    int maxCapacityofPassengers;

    public Car(String code, Route fixedRoute, int maxCapacityofPassengers){
        this.code=code;
        this.fixedRoute= fixedRoute;
        this.maxCapacityofPassengers=maxCapacityofPassengers;

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

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getMaxCapacityofPassengers() {
        return maxCapacityofPassengers;
    }

    public void setMaxCapacityofPassengers(int maxCapacityofPassengers) {
        this.maxCapacityofPassengers = maxCapacityofPassengers;
    }


}
