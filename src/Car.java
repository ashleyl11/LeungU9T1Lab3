public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric(){
        return electric;
    }

    public boolean isDiscountApplied(){
        return discountApplied;
    }

    public void printCar(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Number of Passengers: " + getPassengers());
        System.out.println("Electric? " + electric);
        System.out.println("Discount Applied? " + discountApplied);
    }

    public void setDiscountApplied(boolean set){
        discountApplied = set;
    }

    public boolean dropOffPassengers(int numOut){
        if (numOut >= getPassengers()){
            return false;
        } else {
            updatePassengers(-1 * numOut);
            return true;
        }
    }

    public void applyDiscount(){
        if (electric && discountApplied == false){
            setTollFee(0.5);
            discountApplied = true;
        }
    }
}