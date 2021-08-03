package tester;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import StackArray.StackImpl;

class StackTest {

	@Test
	void testForEmpty() {
		StackImpl stack = new StackImpl(3);
		assertTrue(stack.IsEmpty());
	}

	@Test
	void testForFull() {
		StackImpl stack = new StackImpl(3);
		assertFalse(stack.IsFull());
	}

	@Test
	void testPushUtilFull() {
		StackImpl stack = new StackImpl(1);
		stack.Push(1);
		assertTrue(stack.IsFull());
	}

	@Test
	void testPushPopAndValidate() {
		StackImpl stack = new StackImpl(1);
		int e = 5;
		stack.Push(e);
		assertTrue(stack.Pop() == e);
	}

}
