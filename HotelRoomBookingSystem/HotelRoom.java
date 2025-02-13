package HotelRoomBookingSystem;

public class HotelRoom {
  private int roomNumber;
  private boolean isBooked = false;

  public int getRoomNumber(){
    return roomNumber;
  }

  public HotelRoom(int roomNumber){
    this.roomNumber = roomNumber;
  }

  public synchronized void BookRoom(int roomNumber, String guestName, String name) throws RoomAlreadyBookedException{
    System.out.println("Guest: "+ guestName + " is trying to book room number "+ this.roomNumber + "in " + name);
    if(isBooked == true){

      throw new RoomAlreadyBookedException("Sorry, " + guestName + "The room "+roomNumber + " is already booked");
    }
    try{
      Thread.sleep(1000);
    }
    catch(Exception e){
      System.out.println("Error while sleeping after thread " + name);
    }
    isBooked = true;
    System.out.println("The room no:" + roomNumber + "Is booked by "+ guestName);
  }
  
}
