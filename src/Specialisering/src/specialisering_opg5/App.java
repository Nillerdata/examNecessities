package Specialisering.src.specialisering_opg5;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehicle>vehicles = new ArrayList<>();

        Vehicle car = new Car("Bob","Mercedes",2012,500.12,4);
        Vehicle truck = new Truck("John","Deere",2000,10000.5,4000);
        Vehicle motorcycle = new Motorcycle("Que pasa","Yamaha",1999,2000.2,500);

        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorcycle);

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
        car.start();
        truck.start();
        motorcycle.start();

        car.stop();
        truck.stop();
        motorcycle.stop();

        car.performAction();
        truck.performAction();
        motorcycle.performAction();
    }
}
