package BankWithdrawlSystem;

public class BankAccount {

  private String name;
  private long accountNumber;
  private int balance;
  
  public BankAccount(String name, int balance, long accountNumber){
    this.name = name;
    this.balance = balance;
    this.accountNumber = accountNumber;
  }

  public synchronized void withdraw(double amount, String threadName) throws InsufficientFundsException{
    System.out.println(threadName + " is attempting to withdraw: $" + amount);

    if (amount > balance) {
        throw new InsufficientFundsException(threadName + " - Insufficient balance! Available: $" + balance);
    }
    try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

    balance -= amount;
    System.out.println(threadName + " successfully withdrew $" + amount + ". Remaining balance: $" + balance);
  }
  
}
