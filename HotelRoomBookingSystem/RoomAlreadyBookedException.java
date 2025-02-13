package HotelRoomBookingSystem;

public class RoomAlreadyBookedException extends Exception {
  public RoomAlreadyBookedException(String name){
    super(name);
  }
}
