import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Routs ===============================================================================================
        Route route1 = new Route("Al-Narjis Neighborhood ","Tuwaiq Academy",40);
        Route route2 = new Route("Riyadh airport","King Abdullah financial district",90);

        //Cars ================================================================================================
        Car car1 = new Car("Genesis g80 '101'",route1,3);
        Car car2 = new Car("Camry '130'",route2,0);


        System.out.println("=========================================================");
        System.out.println("========================== cars =========================");
        System.out.println("=========================================================\n");

        System.out.println("========= car 1 =========");
        System.out.println("-Car code: "+ car1.getCode());
        System.out.println("-Car PickUP Address: " + car1.fixedRoute.pickupAddress);
        System.out.println("-Car destination Address: "+ car1.fixedRoute.destinationAddress);
        System.out.println("-Trip price: "+ car1.fixedRoute.getTripPrice()+"$");
        System.out.println("-Car capacity: "+ car1.getMaxCapacityofPassengers());

        System.out.println("\n========= car 2 =========");
        System.out.println("-Car code: "+car2.getCode());
        System.out.println("-Car PickUP Address: " + car2.fixedRoute.pickupAddress);
        System.out.println("-Car destination Address: "+car2.fixedRoute.destinationAddress);
        System.out.println("-Trip price: "+car2.fixedRoute.getTripPrice()+"$");
        System.out.println("-Car capacity: "+car2.getMaxCapacityofPassengers());


        //Passengers ===================================================================================

        System.out.println("\n=========================================================");
        System.out.println("======================= Passengers ======================");
        System.out.println("=========================================================");


        SubscribersPassengers subscribersPassengers = new SubscribersPassengers("Abdulaziz","021",car1);

        NonSubscribersPassengers nonSubscribersPassengers = new NonSubscribersPassengers("Ahmed","147", car2,true);

        
         //calculate Trip price:

         //subscribers Passengers
        try {
            subscribersPassengers.calculateTripcost(car1);
        }catch (Exception e){
            System.out.println(e.getMessage().toUpperCase());
        }

        //nonSubscribersPassengers
        try{
        nonSubscribersPassengers.calculateTripcost(car2);
        }catch (Exception e){
            System.out.println(e.getMessage().toUpperCase());
        }

        //Save Passengers in Array list
        ArrayList<Passenger> passengerss = new ArrayList<>();
        passengerss.add(subscribersPassengers);
        passengerss.add(nonSubscribersPassengers);
        //Printing Passengers List
        for (Passenger p:passengerss){
            System.out.println("\n========= Passenger ========="+p.toString());
        }

        //check car capacity after passenger reserve, the capacity should be decreased.
//        System.out.println("\n==================================================================");
//        System.out.println("car1 101 Capacity after passenger reserve: "+car1.getMaxCapacityofPassengers());
//        System.out.println("car2 102 Capacity after passenger reserve: "+car2.getMaxCapacityofPassengers());
//        System.out.println("==================================================================\n");

    }
}
