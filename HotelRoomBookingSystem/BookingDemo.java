package HotelRoomBookingSystem;

public class BookingDemo {
  public static void main(String[] args) {
    HotelRoom room = new HotelRoom(201);
    Thread t1 = new Guest("Dheeraj", room);
    Thread t2 = new Guest("Aayush", room);
    Thread t3 = new Guest("Gowtham ", room);
    t1.start();
    t2.start();
    t3.start();
  }
}
