package ds.queue;

public class App {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		queue.insert(23);
		queue.insert(43);
		queue.insert(52);
		queue.insert(64);
		queue.insert(75);
		
		long test = queue.remove();
		long test1 = queue.remove();
		long test2 = queue.remove();
		
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test2);
		
		queue.view();
	}

}
