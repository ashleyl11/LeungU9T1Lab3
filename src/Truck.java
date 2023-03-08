public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Number of Passnegers: " + getPassengers());
        System.out.println("Number of Axles: " + axles);
        System.out.println("Has trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate(){
        if (!hasTrailer){
            return true;
        } else if (axles > 4) {
            String temp = getLicensePlate();
            if (temp.substring(temp.length()-2).equals("MX")){
                return true;
            }
        } else {
            String temp = getLicensePlate();
            if (temp.substring(temp.length()-2).equals("LX")){
                return true;
            }
        }
        return false;
    }
}