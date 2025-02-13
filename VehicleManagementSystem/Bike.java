package VehicleManagementSystem;

public class Bike extends Vehicle{
  private int chasisNumber;
  @Override
  public void startEngine(){
    System.out.println("The bike engine is started");
  }

  public Bike(int chasisNumber, String model, int year){
    super(model, year);
    this.chasisNumber = chasisNumber;
  }
}
