package VehicleManagementSystem;

import java.util.ArrayList;
public class Test {
  public static void main(String[] args) {
    Bike b1 = new Bike(1000, "Honda", 2021);
    Bike b2 = new Bike(1001, "Yamaha", 2021);

    Vehicle flyingCar = new Vehicle("Space saucer", 2025){
      @Override
      public void startEngine(){
        System.out.println("This vehicle is unknown. Doesnt have an engine. Runs with soul");
      }
    };
  flyingCar.startEngine();
  }
}
