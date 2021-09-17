package LinkedList;


public class SinglyListUsingArray implements LinkedListIntf {
	private class Node {
		int data;
		int next;

		public Node() {
			data = 0;
			next = -2;
		}
	}

	Node[] dataArea; // Where memory for nodes will be allocated.
	int head;

	public SinglyListUsingArray(int size) {
		dataArea = new Node[size];
		for (int i = 0; i < size; ++i) {
			dataArea[i] = new Node();
		}

		head = -1;
	}

	int GetNewElement() {
		for (int i = 0; i < dataArea.length; ++i) {
			if (dataArea[i].next == -2) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode
		int newNode = GetNewElement();

		// Store element in newNode's data
		dataArea[newNode].data = element;

		// Set newNode's next to head
		dataArea[newNode].next = head;

		// Set head to newNode
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;

		listElements = new int[GetNodeCount()];
		int i = 0;
		// Set current to fist node of list.
		int curr = head;

		// while (current is not empty) do
		while (curr != -1) {
			// Process current node.
			listElements[i] = dataArea[curr].data;
			System.out.println(dataArea[curr].data);
			++i;

			// Set current to current node's next.
			curr = dataArea[curr].next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {
		// TODO Auto-generated method stub

	}

	public int GetNodeCount() {
		int count = 0;
		// Set current to fist node of list.
		int curr = head;

		// while (current is not empty) do
		while (curr != -1) {
			// Process current node.
			++count;

			// Set current to current node's next.
			curr = dataArea[curr].next;
		}

		return count;
	}
}
