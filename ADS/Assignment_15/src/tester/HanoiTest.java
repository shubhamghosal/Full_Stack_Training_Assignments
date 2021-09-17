package tester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.app.hanoi.Hanoi;
import com.app.hanoi.StackImpl;

class HanoiTest {

	@Test
	void test() {
		System.out.println("Test 1 :");
		StackImpl<Integer> s1 = new StackImpl<>(1);
		s1.push(1);
		StackImpl<Integer> s2 = new StackImpl<>(1);
		StackImpl<Integer> s3 = new StackImpl<>(1);

		Hanoi.solve(s1, s2, s3, 1);

		assertTrue(s1.isEmpty());
		assertTrue(s2.isEmpty());
		assertTrue(s3.isFull());
		assertEquals(1, s3.stack[0]);

	}

	@Test
	void test2() {
		System.out.println("Test 2 :");

		StackImpl<Integer> s1 = new StackImpl<>(2);
		s1.push(2);
		s1.push(1);
		StackImpl<Integer> s2 = new StackImpl<>(2);
		StackImpl<Integer> s3 = new StackImpl<>(2);

		Hanoi.solve(s1, s2, s3, 2);

		assertTrue(s1.isEmpty());
		assertTrue(s2.isEmpty());
		assertTrue(s3.isFull());
		assertEquals(1, s3.stack[1]);
		assertEquals(2, s3.stack[0]);

	}

	@Test
	void test3() {
		System.out.println("Test 3 :");

		StackImpl<Integer> s1 = new StackImpl<>(3);
		s1.push(3);
		s1.push(2);
		s1.push(1);
		StackImpl<Integer> s2 = new StackImpl<>(3);
		StackImpl<Integer> s3 = new StackImpl<>(3);

		Hanoi.solve(s1, s2, s3, 3);

		assertTrue(s1.isEmpty());
		assertTrue(s2.isEmpty());
		assertTrue(s3.isFull());
		assertEquals(1, s3.stack[2]);
		assertEquals(2, s3.stack[1]);
		assertEquals(3, s3.stack[0]);

	}

}
