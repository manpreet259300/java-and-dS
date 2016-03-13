package threadFunctions;

// in this program the value of counter will always be 0 as sysout  will not wait for the the threads to complete their work 
// so there will be no increment in the value of counter

public class withoutJoin {
	
	public static int counter=0;
	
	public static void main(String[] args) {
	
		
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i =0; i<1000;i++){
					counter++;
				}
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i =0; i<1000;i++){
					counter++;
				}
			}			
		});
		
		t1.start();
		t2.start();
		System.out.println("Value of counter is " + counter);

	}

}
