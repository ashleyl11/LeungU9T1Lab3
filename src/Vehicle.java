public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public double getTollFee(){
        return tollFee;
    }

    public void setTollFee(double amount){
        tollFee *= amount;
    }

    public int getPassengers(){
        return passengers;
    }

    public void updatePassengers(int change){
        passengers += change;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }
}