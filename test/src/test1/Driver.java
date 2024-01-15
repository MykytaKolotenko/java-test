package test1;

public class Driver {
    private final String name;
    private final Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public boolean isCarBroken() {
        return car.isBroken();
    }

   public void repare() {
        this.car.setBroken(false);
        System.out.println("repared car " +  this.getCar().getCarName()+ " " + name);
    }

}
