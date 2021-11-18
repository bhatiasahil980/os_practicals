package src.com.main;

import java.util.concurrent.Semaphore;
class SharedResource 
{
    static int count = 0;
}
  
class SEMAThread extends Thread
{
    Semaphore s;
    String threadName;
    public SEMAThread(Semaphore s, String threadName) 
    {
        super(threadName);
        this.s=s;
        this.threadName = threadName;
    }
  
    @Override
    public void run() {
         
        if(this.getName().equals("Read"))
        {
            System.out.println("Starting " + threadName);
            try 
            {
                System.out.println(threadName + " is waiting for a permit.");
              
                s.acquire();
              
                System.out.println(threadName + " gets a permit.");
          
                for(int i=0; i<5; i++)
                {
                    SharedResource.count++;
                    System.out.println(threadName + ": " + SharedResource.count);
          
                    Thread.sleep(10);
                }
            } 
            catch (InterruptedException exc) 
            {
                System.out.println(exc);
            }
          
                System.out.println(threadName + " releases the permit.");
                s.release();
        }
          
        else
        {
            System.out.println("Starting " + threadName);
            try 
            {
                System.out.println(threadName + " is waiting for a permit.");
              
                s.acquire();
              
                System.out.println(threadName + " gets a permit.");
          
                for(int i=0; i<5; i++)
                {
                    SharedResource.count--;
                    System.out.println(threadName + ": " + SharedResource.count);
          
                    Thread.sleep(10);
                }
            } 
            catch (InterruptedException exc) 
            {
                 System.out.println(exc);
            }
   
                System.out.println(threadName + " releases the permit.");
                s.release();
        }
    }
}

public class ReadWriteSemaphore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  Semaphore sem = new Semaphore(1);
	      
	        SEMAThread a = new SEMAThread(sem, "Read");
	        SEMAThread b = new SEMAThread(sem, "Write");
	      
	        a.start();
	        b.start();
	      
	        a.join();
	        b.join();
	         
	        System.out.println("count: " + SharedResource.count);
	}

}
