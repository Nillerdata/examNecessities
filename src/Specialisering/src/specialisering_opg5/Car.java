package Specialisering.src.specialisering_opg5;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, double mileage, int numDoors) {
        super(make, model, year, mileage);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("number of doors is " + numDoors);
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Vroom Vroom");
    }

    @Override
    public void stop(){
        super.stop();
        System.out.println("Stopping the car");
    }
    @Override
    public void performAction(){
        super.performAction();
        System.out.println("Honking the car");
    }
}
