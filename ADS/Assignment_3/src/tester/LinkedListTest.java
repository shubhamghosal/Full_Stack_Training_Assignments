package tester;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import LinkedList.SinglyLinkedList;

class LinkedListTest {

	@Test
	void testAddAtFront() {
		SinglyLinkedList cq = new SinglyLinkedList();
		cq.AddAtFront(5);
		cq.AddAtFront(4);
		int[] listElements = cq.GetAllElements();
		assertTrue((listElements[0] == 4) && (listElements[1] == 5));

	}

	@Test
	void testAddAtRear() {
		SinglyLinkedList cq = new SinglyLinkedList();
		cq.AddAtRear(1);
		cq.AddAtRear(4);
		int[] listElements = cq.GetAllElements();
		assertTrue((listElements[1] == 4) && (listElements[0] == 1));
	}

}
