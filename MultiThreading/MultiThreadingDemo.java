package MultiThreading;

public class MultiThreadingDemo{
  public static void main(String[] args) {
    
    for(int i=1;i<=5;i++){
      MultithreadThing myThread = new MultithreadThing(i);
      Thread newone = new Thread(myThread);
      newone.start();
      try{
        newone.join();
      }catch(Exception e){

      }
    }
  }
}