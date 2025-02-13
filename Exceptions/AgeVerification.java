package Exceptions;

class InvalidAgeVerification extends Exception{
  public InvalidAgeVerification(String message){
    super(message);
  }
}


public class AgeVerification {
  public static void validate(int age) throws InvalidAgeVerification{
      if(age<18){
        throw new InvalidAgeVerification("Age is below 18.");
      }
      System.out.println("Valid age: "+age);
  }


  public static void main(String[] args) {
    try{
      validate(17);
    }
    catch(Exception e){
      System.out.println("Caught exception is : " + e.getMessage());
    }
  }
}
