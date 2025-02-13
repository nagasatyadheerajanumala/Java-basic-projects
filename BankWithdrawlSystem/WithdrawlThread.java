package BankWithdrawlSystem;

public class WithdrawlThread extends Thread {
  private BankAccount bankAccount;
  private int amount;

  public WithdrawlThread(BankAccount bankAccount, int amount, String name){
    super(name);
    this.bankAccount = bankAccount;
    this.amount = amount;
  }

  @Override
  public void run(){
    try{
      this.bankAccount.withdraw(amount, Thread.currentThread().getName());
    }
    catch(InsufficientFundsException e){
      System.out.println("Insufficient funds and the exception is : " + e.getMessage());
    }
  }
}
