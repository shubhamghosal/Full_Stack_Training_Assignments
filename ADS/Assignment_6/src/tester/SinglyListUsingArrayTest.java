package tester;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import LinkedList.SinglyListUsingArray;

class SinglyListUsingArrayTest {
	@Test
	void testEmptyList() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}
	@Test
	void testAddAtFrontOneElement() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		SinglyListUsingArray slist = new SinglyListUsingArray(10);
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}}
