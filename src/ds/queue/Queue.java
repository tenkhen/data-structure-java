package ds.queue;

// Queue is known as FIFO (first in first out). Whatever we insert first, it will be
// removed when we pop. For example like printer. Whatever document we sent to printer first,
// will be printed first and others will be in queue.
public class Queue {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;

	}

	public long remove() {
		long temp = queArray[front];
		front++;
		if (front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	public void view() {
		System.out.print("[ ");
		for (long num : queArray) {
			System.out.print(num + " ");
		}
		System.out.print("]");
	}
}
