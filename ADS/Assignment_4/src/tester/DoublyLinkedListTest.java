package tester;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import DoublyLinkedList.DoublyLinkedList;

class DoublyLinkedListTest {
	@Test
	void testEmptyList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}

	@Test
	void testAddAtFrontTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5
		int[] listRevElements = slist.GetAllElementsInReverseOrder();

		assertTrue((listElements.length == 2) && (listElements[0] == element2) && (listElements[1] == element1)
				&& (listRevElements[0] == element1) && (listRevElements[1] == element2));
	}


	void testDelete() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 4;
		int element2 = 18;
		int element3 = 4;

		slist.AddAtFront(element1);
		slist.AddAtFront(element2);
		slist.AddAtFront(element3);

		slist.Delete(element3);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements[0] != element3) && (listElements[1] == element2) && (listElements[2] != element1));
	}
}
