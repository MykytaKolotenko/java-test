package test1;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car(true, 10000, 2000, 250, "bmw");
        Car honda = new Car(true, 101000, 2200, 350, "honda");

        Driver driver1 = new Driver("Mykyta", bmw);
        Driver driver2 = new Driver("Danya", honda);
        Driver driver3 = new Driver("Danya", honda);


        AutoserviceStation.repare(driver2);
        AutoserviceStation.repare(driver3);


    }
}
