import stack.Stack;
import stack.stackexceptions.EmptyStackException;

public class MainClass {

	public static void main(String[] args) {
		Stack stack=new Stack();
		try {
		stack.push(231);
		stack.push(31);
		stack.push(32);
		stack.push(212);
		stack.pop();
		stack.displayAll();
		stack.pop();
		stack.displayAll();
		stack.pop();
		stack.pop();
		stack.displayAll();
		stack.pop();// as stack is empty it throws error
		
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		
		
	}

}
