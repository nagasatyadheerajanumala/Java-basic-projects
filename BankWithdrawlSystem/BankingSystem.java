package BankWithdrawlSystem;

public class BankingSystem {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount("Dheeraj", 2000, 12312312);
    Thread t1 = new WithdrawlThread(ba, 100, "Thread 1");
    Thread t2 = new WithdrawlThread(ba, 200, "Thread 2");
    Thread t3 = new WithdrawlThread(ba, 0, "Thread 3");
    t1.start();
    t2.start();
    t3.start(); 
  }
  
}
