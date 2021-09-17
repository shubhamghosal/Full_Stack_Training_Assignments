package collections;

public class InfiniteStack<T> {

	private CircularLinkedList<T> list;

	public InfiniteStack() {
		list = new CircularLinkedList<T>();
	}

	public T pop() {
		if (isEmpty())
			return null;
		return list.removeAtFront();
	}

	public void push(T e) {
		list.addAtFront(e);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public T peek() {
		T e = list.removeAtFront();
		list.addAtFront(e);
		return e;
	}

}
