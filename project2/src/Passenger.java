public abstract class Passenger {
    String name;
    String id;
    double tripCost;
    Car reservedCar;
    public Passenger(String name, String id,Car reservedCar){
        this.name=name;
        this.id=id;
        this.tripCost=tripCost;
        this.reservedCar =reservedCar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost =tripCost;
    }

    abstract double calculateTripcost(Car car)throws Exception ;


    public String toString(Car car) {
        return "\nPassenger name: "+getName()+
                "\nPassenger ID: "+getId()+
                "\nCar code: "+car.getCode()+
                "\n route price: "+getTripCost();
    }
}
