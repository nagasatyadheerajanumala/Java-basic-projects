package VehicleManagementSystem;

public class Car extends Vehicle {
  private String company;
  
  @Override
  public void startEngine(){
    System.out.println("The car engine started!");
  }

  public Car( String company,String model, int year){
    super(model, year);
    this.company = company;
  }
  
}
