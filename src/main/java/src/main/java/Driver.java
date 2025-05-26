package src.main.java;
public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Counter Count:" + counter.getCount());
		
		counter.increaseBy(5);
		
		System.out.println("Counter Count:" + counter.getCount());
		
		counter.decreaseBy(2);
		
		System.out.println("Counter Count:" + counter.getCount());
		
		counter.multiplyBy(6);
	}

}
