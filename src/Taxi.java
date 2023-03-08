public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate,
                double tollFee,
                int passengers,
                boolean electric,
                double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected(){
        return fareCollected;
    }

    public void printTaxi(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Number of Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount Applied? " + isDiscountApplied());
        System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        updatePassengers(numRiders);
        double addedFare = numRiders * farePerRider;
        fareCollected += addedFare;

        if (getPassengers() >= 4 && !isDiscountApplied()){
            setTollFee(0.5);
            setDiscountApplied(true);
        }
    }
}
