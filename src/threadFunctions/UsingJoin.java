package threadFunctions;

// used join in threads so that before execution of sysout the threads should complete their.
// however it does not guarantee that the output will be correct as there will be a race condition between the two threads
// due to race condition the vvalue of counter will not come as expected
// sometimes the execution of counter++ from thread 1 might get lost and sometimes from thread 2 might get lost

public class UsingJoin {
	
	static int counter = 0;
		
	public static void main(String[] args) {


		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i =0; i<10000;i++){
					counter++;
				}
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i =0; i<10000;i++){
					counter++;
				}
			}			
		});
		
		t1.start();
		t2.start();

// added join just before the sysout so now th sysout command will wait till  threads execution is completed
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Value of counter is " + counter);
		
	}

}
