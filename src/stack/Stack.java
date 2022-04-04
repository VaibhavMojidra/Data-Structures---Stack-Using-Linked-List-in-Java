package stack;

import stack.stackexceptions.EmptyStackException;

public class Stack {
	private int top;
	private Node head;
	public Stack() {
		top=0;
		head=null;
	}

	public boolean push(int data) { //O(1)
		Node newNode=new Node();
		newNode.setData(data);
		newNode.setNext(head);
		head=newNode;
		top++;
		return true;
	}
	
	public boolean pop() throws EmptyStackException { //O(1)
		if(isEmpty()) {
			throw new EmptyStackException("No elements in stack to pop");
		}else {
			head=head.getNext();
			top--;
			return true;
		}
	}
	
	public int peek() { //O(n)
		return head.getData();
	}
	
	public void displayAll() { //O(n)
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public int count() { //O(1)
		return top;
	}
	
	public boolean isEmpty() { //O(1)
		return top==0;
	}
}
