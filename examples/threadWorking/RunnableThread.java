package threadWorking;

class threadSample implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getId() + " - id and value - " + i);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread T1= new Thread(new threadSample());
		Thread T2= new Thread(new threadSample());
		T1.start();
		T2.start();
	}

}
