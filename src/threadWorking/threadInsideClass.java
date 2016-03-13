package threadWorking;

public class threadInsideClass {

	public static void main(String[] args) {
	
		Thread T1 = new Thread(new Runnable() {
			public void run() {
			for (int i=0;i<10;i++) {	
				System.out.println(Thread.currentThread().getId() + " - id and value - " + i);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		
		T1.start();

	}

}
