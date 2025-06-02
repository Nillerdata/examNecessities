package Specialisering.src.specialisering_opg5;

public class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String make, String model, int year, double mileage, int engineSize) {
        super(make, model, year, mileage);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("enginesize is " + engineSize);
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Vroom Vroom");
    }
    @Override
    public void stop(){
        super.stop();
        System.out.println("Stopping the motorcycle");
    }
    @Override
    public void performAction(){
        super.performAction();
        System.out.println("Revving the engine");
    }
}
