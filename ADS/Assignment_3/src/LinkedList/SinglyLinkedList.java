package LinkedList;

public class SinglyLinkedList implements LinkedListIntf {
	private SinglyListNode head;
	private SinglyListNode tail;

	public SinglyLinkedList() {
		head = null;
	}

	@Override
	public void AddAtFront(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;
		if (head == null) {
			listElements = new int[0];
			return listElements;
		}

		listElements = new int[GetNodeCount()];
		int i = 0;
		SinglyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}

	public int GetNodeCount() {
		int count = 0;
		SinglyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}

}
