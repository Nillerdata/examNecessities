package Specialisering.src.specialisering_opg5;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    //--------------------------------------------

    //get og set

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //display

    public void displayInfo(){
        System.out.println("make is: " + getMake() + "\n" +
                " model is: " + getModel() + "\n" +
                " year is: " + getYear() + "\n" +
                " mileage on vehicle is: " + getMileage());
    }
    public void start(){
        System.out.println("Starting the " + getClass().getSimpleName() + "...");
    }

    public void stop(){
        System.out.println("Stopping the " + getClass().getSimpleName() + "...");
    }
    public void performAction(){
        System.out.println("Performing " + getClass().getSimpleName() + " action ");
    }
}
