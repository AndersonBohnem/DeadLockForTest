public class Deadlock {
    public static void main(String[] args){
      final Object resource1 = "Recurso 1";
      final Object resource2 = "Recurso 2";
      Thread t1 = new Thread() {
        public void run() {
          synchronized(resource1){
            System.out.println("Thread 1: Recurso bloqueado 1");
            try{ 
              Thread.sleep(50); 
            } catch (InterruptedException e) {}
            synchronized(resource2){
              System.out.println("Thread 1: Recurso bloqueado 2");
            }
          }
        }
      };
      Thread t2 = new Thread(){
        public void run(){
          synchronized(resource2){
            System.out.println("Thread 2: Recurso bloqueado 2");
            try{
              Thread.sleep(50); 
            } catch (InterruptedException e){}
            synchronized(resource1){
              System.out.println("Thread 2: Recurso bloqueado 1");
            }
          }
        }
      };
      t1.start(); 
      t2.start();
    }
  }