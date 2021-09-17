package DoublyLinkedList;

public class DoublyLinkedList implements LinkedListIntf {
	private DoublyListNode head;
	private DoublyListNode tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		// Set newNode's next to empty.
		// Set newNode's previous to empty.
		DoublyListNode newNode = new DoublyListNode(element);

		// if list is empty then
		if (head == null) {
			// Set head and tail to newNode.
			head = newNode;
			tail = newNode;
			// Stop.
			return;
		}

		// Set neWNode's next to head
		newNode.next = head;
		// Set head's previous to newNode
		head.prev = newNode;
		// Set head to newNode
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
		}
		tail = newNode;

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
		DoublyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {

		DoublyListNode temp = head, prev = null;

		while (temp != null && temp.data == element) {
			head = temp.next;
			temp = head;
		}
		// Delete occurrences other than head
		while (temp != null) {
			// Search for the element to be deleted,
			while (temp != null && temp.data != element) {
				prev = temp;
				temp = temp.next;
			}
			if (temp == null)
				return;
			prev.next = temp.next;
			temp = prev.next;
		}

	}

	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}
	@Override
	public int[] GetAllElementsInReverseOrder() {
		int[] listRevElements;

		if (tail == null) {
			listRevElements = new int[0];
			return listRevElements;
		}

		listRevElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = tail;
		// Get elements from tail to head in reverse order
		while (curr != null) {
			listRevElements[i] = curr.data;
			++i;
			curr = curr.prev;
		}

		return listRevElements;
	}
}
