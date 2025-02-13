package VehicleManagementSystem;

abstract class Vehicle {
  protected String model;
  protected int year;
  public Vehicle(String model, int year){
    this.model = model;
    this.year = year;
  }  
  public abstract void startEngine();
  public void displayInfo(){
    System.out.println("Model:" + this.model + "Make year: " + this.year);
  }

}
