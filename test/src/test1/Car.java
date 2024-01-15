package test1;

public class Car {
    private  boolean isBroken;
    private String carName;
    private int price;
    private int weight;
    private int speed;

    public Car(boolean broken, int price, int weight, int speed, String carName) {
        this.isBroken = broken;
        this.price = price;
        this.weight = weight;
        this.speed = speed;
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public int getPrice() {
        return price;
    }
}
