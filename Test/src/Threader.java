
public class Threader implements Runnable{
int a,b;

public static void main(String []args)
	{
	Thread t=new Thread(new Threader(),"MMA");
	Thread t1=new Thread(new Threader(),"MMA");
	t.start();
	t1.start();
	System.out.println("t to be yielded");
	t.yield();
	System.out.println("t is yielded");
	t1.notifyAll();
	t1.yield();
	}

@Override
public void run() {
	a=1;
	System.out.println("Wait to start");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Wait to end");
	
	b=1;
	System.out.print(a+b);
	
}
}
