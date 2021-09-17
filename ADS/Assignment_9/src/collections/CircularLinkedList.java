package collections;

public class CircularLinkedList<T> implements ILinkedList<T> {

	private DoublyListNode<T> head;

	public CircularLinkedList() {
		head = new DoublyListNode<T>();
		head.next = head;
		head.prev = head;
	}

	@Override
	public void addAtFront(T e) {
		DoublyListNode<T> newNode = new DoublyListNode<T>(e);
		newNode.next = head.next;
		newNode.next.prev = newNode;
		newNode.prev = head;
		head.next = newNode;

	}

	@Override
	public void addAtRear(T e) {
		DoublyListNode<T> newNode = new DoublyListNode<T>(e);
		newNode.next = head;
		newNode.prev = head.prev;
		newNode.prev.next = newNode;
		head.prev = newNode;

	}

	@Override
	public Object[] getAllElements() {
		Object[] elements = new Object[getNodeCount()];
		DoublyListNode<T> cur = head.next;
		int i = 0;
		while (cur != head) {
			elements[i] = cur.data;
			cur = cur.next;
			i++;
		}

		return elements;
	}

	@Override
	public T removeAtRear() {
		if (head.prev == head)
			throw new RuntimeException("Empty List!!");
		T e = head.prev.data;
		head.prev = head.prev.prev;
		head.prev.next = head;
		return e;
	}

	@Override
	public T removeAtFront() {
		if (head.next == head)
			throw new RuntimeException("Empty List!!");
		T e = head.next.data;
		head.next = head.next.next;
		head.next.prev = head;
		return e;
	}

	@Override
	public void delete(T e) {
		if (head.next == head)
			throw new RuntimeException("Empty List!!");
		DoublyListNode<T> cur = head.next;
		while (cur != head) {
			if (cur.data.equals(e)) {
				cur.prev.next = cur.next;
				cur.next.prev = cur.prev;
				return;
			}
			cur = cur.next;
		}

	}

	@Override
	public int countFrequency(T e) {
		int count = 0;
		DoublyListNode<T> cur = head.next;
		while (cur != head) {
			if (cur.data.equals(e)) {
				count++;
			}
			cur = cur.next;
		}
		return count;
	}

	public int getNodeCount() {
		int count = 0;
		DoublyListNode<T> cur = head.next;
		while (cur != head) {
			cur = cur.next;
			count++;
		}

		return count;
	}

	public boolean isEmpty() {
		return getNodeCount() == 0;
	}

}
