public class SubscribersPassengers extends Passenger {
    public SubscribersPassengers(String name, String id,Car reservedCar) {
        super(name, id,reservedCar);
    }

    @Override
    double calculateTripcost(Car reservedCar)throws Exception
    {

        if (reservedCar.getMaxCapacityofPassengers() == 0){
            throw new Exception("\n || EXCEPTION maximum capacity of the "+ '['+reservedCar.getCode()+']' +" was equal to zero. ||");
        }
        tripCost =reservedCar.fixedRoute.getTripPrice()-(reservedCar.fixedRoute.getTripPrice() * 0.5);
        reservedCar.setMaxCapacityofPassengers(reservedCar.getMaxCapacityofPassengers()-1);
        return tripCost;
    }


    @Override
    public String toString() {
        return "\nPassenger name: "+getName()+
                "\nPassenger ID: "+getId()+
                "\nCar code: "+ reservedCar.getCode()+
                "\nCar PickUP Address: "+ reservedCar.fixedRoute.pickupAddress+
                "\nCar destination Address: "+reservedCar.fixedRoute.destinationAddress+
                "\nroute price: "+ tripCost+"$";
    }
}
