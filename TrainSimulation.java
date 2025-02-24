public class TrainSimulation {
    public static void main(String[] args) {
        // step 1: create a Train and get its Engine
        Train myTrain = new Train(FuelType.STEAM, 50.0, 100.0, 3, 5);
        Engine myEngine = myTrain.getEngine(); 

        // step 2: adding some Passengers
        Passenger p1 = new Passenger("Amelia");
        Passenger p2 = new Passenger("Buddy");
        Passenger p3 = new Passenger("Isa");

        System.out.println("\n--- Passenger Boarding ---");
        p1.boardCar(myTrain.getCar(0)); // Amelia boards Car 1
        p2.boardCar(myTrain.getCar(1)); // Buddy boards Car 2
        p3.boardCar(myTrain.getCar(2)); // Isa boards Car 3

        // step 3: print the train's manifest
        System.out.println("\n--- Train Manifest ---");
        myTrain.printManifest();

        // step 4: remove a Passenger
        System.out.println("\n--- Passenger Departure ---");
        p2.getOffCar(myTrain.getCar(1)); // Buddy leaves Car 2

        // step 5: print the manifest again
        System.out.println("\n--- Updated Train Manifest ---");
        myTrain.printManifest();

        // step 6: check seat availability
        System.out.println("\nSeats remaining: " + myTrain.seatsRemaining());

        // step 7: check fuel and move the train using its engine
        System.out.println("\n--- Train Moving ---");
        while (myEngine.go()) {  // Use myEngine to move the train
            System.out.println("Train is running...");
        }

        System.out.println("Train is out of fuel.");

        // step 8: refuel the train's engine and move again
        System.out.println("\n--- Refueling the Train ---");
        myEngine.refuel();
        System.out.println("Fuel refilled! Current fuel: " + myEngine.getCurrentFuel());

        while (myEngine.go()) {
            System.out.println("Train is running again...");
        }

        System.out.println("Train is out of fuel again.");
    }
}
