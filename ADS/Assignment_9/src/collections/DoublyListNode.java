package collections;

class DoublyListNode<T> {

	public T data;
	public DoublyListNode<T> next;
	public DoublyListNode<T> prev;

	DoublyListNode(T e) {
		data=e;
		next=null;
		prev=null;
		
	}
	
	DoublyListNode() {
		next=null;
		prev=null;
		
	}
	
}
