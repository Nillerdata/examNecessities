package Specialisering.src.specialisering_opg5;

public class Truck extends  Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, double mileage, double loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("load capacity is: " + loadCapacity);
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Rumbling engine");
    }

    @Override
    public void stop(){
        super.stop();
        System.out.println("Stopping the Truck");
    }

    @Override
    public void performAction(){
        super.performAction();
        System.out.println("Activating hydraulic lift!");
    }
}
