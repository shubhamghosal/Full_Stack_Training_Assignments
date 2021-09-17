package DoublyLinkedList;

public class SortedLinkedList implements SortedLinkedListIntf {

	private SinglyListNode head;

	public SortedLinkedList() {
		head = null;
	}

	@Override
	public void Insert(int element) {
		SinglyListNode newLink = new SinglyListNode(element);
		if (head == null) {
			head = newLink;
			// insert in head if x is lower than the head
		} else if (element <= head.data) {
			newLink.next = head;
			head = newLink;
		} else {
			// find the first node which value is lower than x (or the tail)
			SinglyListNode current;
			for (current = head; current.next != null && element >= current.next.data; current = current.next)
				;
			// to remove duplicates
			if (element != current.data) {
				newLink.next = current.next;
				current.next = newLink;
			}
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

	@Override
	public void Delete(int element) {
		// TODO Auto-generated method stub
		
	}

}
