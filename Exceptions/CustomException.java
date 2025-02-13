package Exceptions;

class MyException extends Exception{
  public MyException(String message){
    super(message);
  }
}



public class CustomException {
  public static void main(String[] args) {
    try{
      throw new MyException("This is a custom exception");
    }
    catch(Exception e){
      System.out.println("The message is " + e.getMessage());
    }
  }
}
