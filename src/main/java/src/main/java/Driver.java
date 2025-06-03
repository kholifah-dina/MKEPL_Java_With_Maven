package src.main.java;
public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Counter:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Counter Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Counter Count:" + counter.getCount());
	}

}
