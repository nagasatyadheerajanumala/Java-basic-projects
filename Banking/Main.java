package Banking;

public class Main{
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount("Dheeraj", 232341234);
    b1.deposit(1000);
    b1.deposit(5000);
    b1.deposit(100012);
    try{
      b1.withdrawl(1000);
    }
    catch(InvalidBalanceException e){
      System.out.println(e.getMessage());
    }

    b1.deposit(100);
    try{
      b1.withdrawl(150000);
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }

  }
}