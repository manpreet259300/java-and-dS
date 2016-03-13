package threadFunctions;

// used synchronized keyword so that method will be able to handle on thread at a time and no loss isw occurred
// this version will give the desired result

public class UsingSynchronised {
	
	static int counter = 0;

	
// accessed by one thread at a time	
	public static synchronized void  addcount(){
		counter++;
	}

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i =0; i<10000;i++){
					addcount();
				}
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i =0; i<10000;i++){
					addcount();
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
