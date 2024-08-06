package ds.stack;

public class Utils {
	
	public static String reverse(String str) {
		
		Stack stack = new Stack(str.length());
		String result = "";
		
		// adding all letters to stack
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		// popping all letters from stack. popping will get us in reverse order.
		// if we recall, LIFO (Last In First Out)
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		
		return result;
	}
}
