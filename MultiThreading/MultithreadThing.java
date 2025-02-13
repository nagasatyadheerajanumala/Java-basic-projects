package MultiThreading;

public class MultithreadThing implements Runnable {
  private int number;
  public MultithreadThing(int number){
    this.number = number;
  }

  @Override
  public void run(){
    for(int i=0;i<=5;i++){
      System.out.println(i + " from thread no: " + this.number);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
