package test1;

public class AutoserviceStation {


  static void repare(Driver driver) {
     if (driver.isCarBroken()) {
      driver.getCar().setBroken(false);
      System.out.println("Repared. Payment " + driver.getCar().getPrice() * 0.3);
      } else {System.out.println("Car is not broken");
     }

   }
}
