package threadWorking;

class threadExplained extends Thread {

	@Override
	public void run() {
		for (int i =0;i<10;i++)
			System.out.println(Thread.currentThread().getId() +" - id and value is - "+i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}

	
	
}

public class ExtendingThread {

	public static void main(String[] args) {
		
		threadExplained TE1= new threadExplained();
		threadExplained TE2= new threadExplained();
		threadExplained TE3= new threadExplained();
		
		TE1.start();
		TE2.start();
		TE3.start();
	
	}

}
