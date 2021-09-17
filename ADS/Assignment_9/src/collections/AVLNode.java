package collections;

public class AVLNode {

	int data;
	AVLNode left;
	AVLNode right;
	int h = 0;

	public AVLNode(int i) {
		data = i;
		left = null;
		right = null;
	}
}
