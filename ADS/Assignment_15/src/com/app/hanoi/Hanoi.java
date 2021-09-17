package com.app.hanoi;

public class Hanoi {

	public static void solve(StackImpl<Integer> s1, StackImpl<Integer> s2, StackImpl<Integer> s3, int size) {
		if (size == 1) {
			s3.push(s1.pop());

			System.out.println("\tStack from " + s1);
			System.out.println("\tStack to " + s3);
			System.out.println("\tStack : " + s2);
			System.out.println("----------------");

			return;
		}

		solve(s1, s3, s2, size - 1);
		solve(s1, s2, s3, 1);
		solve(s2, s1, s3, size - 1);
	}

}
