public class NonSubscribersPassengers extends Passenger{
    boolean coupon;
    public NonSubscribersPassengers(String name, String id,Car reservedCar,boolean coupon) {
        super(name, id,reservedCar);
        this.coupon=coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    double calculateTripcost(Car reservedCar)throws Exception
    {
        if (reservedCar.getMaxCapacityofPassengers() == 0){
            throw new Exception("\n || EXCEPTION maximum capacity of the "+ '['+reservedCar.getCode()+']' +" was equal to zero. ||");        }

        if (coupon){
            tripCost =reservedCar.fixedRoute.getTripPrice()-(reservedCar.fixedRoute.getTripPrice() * 0.1);
            reservedCar.setMaxCapacityofPassengers(reservedCar.getMaxCapacityofPassengers()-1);
        }else{
            reservedCar.setMaxCapacityofPassengers(reservedCar.getMaxCapacityofPassengers()-1);
            return tripCost=reservedCar.fixedRoute.getTripPrice();
        }

        return tripCost;
    }

    @Override
    public String toString() {
        return "\nPassenger name: "+getName()+
                "\nPassenger ID: "+getId()+
                "\nCar code: "+ reservedCar.getCode()+
                "\nCar PickUP Address: "+ reservedCar.fixedRoute.pickupAddress+
                "\nCar destination Address: "+reservedCar.fixedRoute.destinationAddress+
                "\nroute price: "+tripCost+"$";
    }
}
