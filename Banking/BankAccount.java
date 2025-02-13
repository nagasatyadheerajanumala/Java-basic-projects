package Banking;

public class BankAccount {

  private String name;
  private double balance;
  private long AccountNumber;
  public BankAccount(String name, long AccountNumber){
    this.name = name;
    this.balance = 0;
    this.AccountNumber = AccountNumber;
  }

  public double getBalance(){
    return this.balance;
  }

  public void deposit(double amount){
    this.balance += amount;
  }

  public void withdrawl(double amount) throws InvalidBalanceException{
    if(this.balance <amount){
      throw new InvalidBalanceException("Invalid balance for withdrawl. Withdrawl amount exceeds the balance.");
    }
    balance-=amount;
    System.out.println("The current balance in account "+this.AccountNumber + " is "+ this.balance);
  }

  public void displayDetails(){
    System.out.println("AccountNumber: "+this.AccountNumber);
    System.out.println("Name of account holder : "+this.name);
    System.out.println("Balance :" + this.balance);
  }

}
