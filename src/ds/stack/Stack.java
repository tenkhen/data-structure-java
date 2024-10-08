package ds.stack;

// STACK DATA STRUCTURE IS CALLED -> LIFO (LAST IN FIRST OUT)
// when we add an item to a stack, it adds to top of other existing item. 
// But when we remove item, it removes from the top. So last item we added will be
// removed first
import java.util.Arrays;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char value) {
		
		if(isFull()) {
			System.out.println("this stack is already full");
		} else {
			top++;
			stackArray[top] = value;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("the stack is already empty");
			return '0';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];			
		}
	}
	
	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize -1;
	}
	
	public char[] getArray() {
		return Arrays.copyOf(stackArray, top+1);
	}
}
