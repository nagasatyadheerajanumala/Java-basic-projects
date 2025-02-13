package Exceptions;

public class First {
  public static void main(String[] args) {
    int n = 30;
    int m = 0;
    try{
      int ans = n/m;
      System.out.println("The answer is " + ans);
    }
    catch(Exception e){
      System.out.println("The possible error is :" +e.getMessage());
    }
    finally{
      System.out.println("The program ended");
    }
  }
}
