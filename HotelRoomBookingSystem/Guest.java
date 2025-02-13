package HotelRoomBookingSystem;

public class Guest extends Thread {
  private String name;
  private HotelRoom room;
  public Guest(String name, HotelRoom room){
    this.name = name;
    this.room = room;
  }

  @Override
  public void run(){
    try{
      room.BookRoom(room.getRoomNumber(), name, Thread.currentThread().getName());
    }
    catch( Exception e){
      System.out.println("Exception: " + e.getMessage());
    }
  }

}
