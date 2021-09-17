package collections;

import java.util.Stack;

public class AVLTree {

	private AVLNode root;

	public AVLTree() {
		root = null;
	}

	public boolean insert(int e) {

		AVLNode newNode = new AVLNode(e);
		newNode.h = 0;
		if (root == null) {
			root = newNode;
			return true;
		}
		AVLNode cur = root;
		Stack<AVLNode> stack = new Stack<>();

		while (true) {
			stack.push(cur);
			if (e == cur.data)
				return false;

			if (e < cur.data) {
				if (cur.left == null) {
					cur.left = newNode;
					break;
				} else
					cur = cur.left;
			} else {
				if (cur.right == null) {
					cur.right = newNode;
					break;
				} else
					cur = cur.right;
			}
		}
		int lh = 0;
		int rh = 0;

		int bf = 0;
		while (bf < 2 && !stack.isEmpty()) {
			cur = stack.pop();
			lh = cur.left == null ? -1 : cur.left.h;
			rh = cur.right == null ? -1 : cur.right.h;
			cur.h = Integer.max(lh, rh) + 1;
			bf = Math.abs(lh - rh);
		}

		if (bf > 1) {
			// perform appropriate rotation
			AVLNode gp = cur;
			int path = 3;
			AVLNode p = null;
			AVLNode x = null;
			AVLNode tmp;
			if (e < gp.data) {
				p = gp.left;
				path -= 1;
			} else {
				p = gp.right;
				path += 1;
			}
			if (e < p.data) {
				path -= 2;
				x = p.left;
			} else {
				path += 2;
				x = p.right;
			}

			switch (path) {
			case 6: // left rotation for RR
				tmp = p.left;
				p.left = gp;
				gp.right = tmp;

				lh = gp.left == null ? -1 : gp.left.h;
				rh = gp.right == null ? -1 : gp.right.h;
				gp.h = Integer.max(lh, rh) + 1;
				lh = p.left == null ? -1 : p.left.h;
				rh = p.right == null ? -1 : p.right.h;
				p.h = Integer.max(lh, rh) + 1;
				if (!stack.isEmpty()) {
					cur = stack.peek();
					cur.right = cur.right == gp ? p : cur.right;
					cur.left = cur.left == gp ? p : cur.left;
				} else {
					root = p;
					return true;
				}

				break;
			case 0: // right rotation for LL

				tmp = p.right;
				p.right = gp;
				gp.left = tmp;

				lh = gp.left == null ? -1 : gp.left.h;
				rh = gp.right == null ? -1 : gp.right.h;
				gp.h = Integer.max(lh, rh) + 1;
				lh = p.left == null ? -1 : p.left.h;
				rh = p.right == null ? -1 : p.right.h;
				p.h = Integer.max(lh, rh) + 1;
				if (!stack.isEmpty()) {
					cur = stack.peek();
					cur.right = cur.right == gp ? p : cur.right;
					cur.left = cur.left == gp ? p : cur.left;
				} else {
					root = p;
					return true;
				}

				break;
			case 4: // for LR
				// left rotation then right rotation

				tmp = x.left;
				x.left = p;
				p.right = tmp;

				gp.left = x.right;
				x.right = gp;

				lh = gp.left == null ? -1 : gp.left.h;
				rh = gp.right == null ? -1 : gp.right.h;
				gp.h = Integer.max(lh, rh) + 1;

				lh = p.left == null ? -1 : p.left.h;
				rh = p.right == null ? -1 : p.right.h;
				p.h = Integer.max(lh, rh) + 1;

				lh = x.left == null ? -1 : x.left.h;
				rh = x.right == null ? -1 : x.right.h;
				x.h = Integer.max(lh, rh) + 1;

				if (!stack.isEmpty()) {
					cur = stack.peek();
					cur.right = cur.right == gp ? x : cur.right;
					cur.left = cur.left == gp ? x : cur.left;
				} else {
					root = x;
					return true;
				}
				break;
			case 2: // for RL
				// right rotation then left rotation
				tmp = x.right;
				x.right = p;
				p.left = tmp;

				gp.right = x.left;
				x.left = gp;

				lh = gp.left == null ? -1 : gp.left.h;
				rh = gp.right == null ? -1 : gp.right.h;
				gp.h = Integer.max(lh, rh) + 1;

				lh = p.left == null ? -1 : p.left.h;
				rh = p.right == null ? -1 : p.right.h;
				p.h = Integer.max(lh, rh) + 1;

				lh = x.left == null ? -1 : x.left.h;
				rh = x.right == null ? -1 : x.right.h;
				x.h = Integer.max(lh, rh) + 1;

				if (!stack.isEmpty()) {
					cur = stack.peek();
					cur.right = cur.right == gp ? x : cur.right;
					cur.left = cur.left == gp ? x : cur.left;
				} else {
					root = x;
					return true;
				}
				break;
			}
		}
		while (!stack.isEmpty()) {
			cur = stack.pop();
			lh = cur.left == null ? -1 : cur.left.h;
			rh = cur.right == null ? -1 : cur.right.h;
			cur.h = Integer.max(lh, rh) + 1;
		}

		return true;

	}

	public boolean delete(int e) {
		AVLNode tmp;
		AVLNode found = null;
		AVLNode cur = root;
		if (cur == null)
			return false;

		Stack<AVLNode> stack = new Stack<>();

		while (cur != null) {
			stack.push(cur);
			if (cur.data == e) {
				found = cur;
				break;
			}
			if (cur.data > e)
				cur = cur.left;
			else
				cur = cur.right;
		}
		if (found == null)
			return false;

		cur = found.left;
		while (cur != null) {
			stack.push(cur);
			cur = cur.right;
		}
		cur = stack.pop();

		if (cur == found) {
			if (cur == root) {
				root = cur.right;
				return true;
			}
			cur = stack.pop();
			if (cur.left == found) {
				cur.left = found.right;
			} else {
				cur.right = found.right;
			}
		} else {
			found.data = cur.data;
			tmp = stack.pop();
			if (cur == tmp.left)
				tmp.left = cur.left;
			else
				tmp.right = cur.left;
			cur = tmp;
		}
		while (true) {
			int lh = cur.left == null ? -1 : cur.left.h;
			int rh = cur.right == null ? -1 : cur.right.h;
			int bf = Math.abs(rh - lh);
			cur.h = Integer.max(rh, lh) + 1;
			if (bf > 1) {
				if (rh > lh) {
					tmp = cur.right;
					cur.right = tmp.left;
					tmp.left = cur;
					if (stack.isEmpty()) {
						root = tmp;
						return true;
					}
					if (stack.peek().left == cur) {
						stack.peek().left = tmp;
					} else {
						stack.peek().right = tmp;
					}
				} else {
					tmp = cur.left;
					cur.left = tmp.right;
					tmp.right = cur;
					if (stack.isEmpty()) {
						root = tmp;
						return true;
					}
					if (stack.peek().left == cur) {
						stack.peek().left = tmp;
					} else {
						stack.peek().right = tmp;
					}
				}
				lh = cur.left == null ? -1 : cur.left.h;
				rh = cur.right == null ? -1 : cur.right.h;
				bf = Math.abs(rh - lh);
				cur.h = Integer.max(rh, lh) + 1;
				cur = tmp;
				lh = cur.left == null ? -1 : cur.left.h;
				rh = cur.right == null ? -1 : cur.right.h;
				bf = Math.abs(rh - lh);
				cur.h = Integer.max(rh, lh) + 1;
			}

			if (stack.isEmpty())
				break;

			cur = stack.pop();
		}
		return true;
	}

	public int[] inOrder() {
		int[] array = new int[nodeCount()];
		int i = 0;
		Stack<AVLNode> s = new Stack<>();
		AVLNode cur = root;
		while (!(s.isEmpty() && cur == null)) {
			while (cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			if (!s.isEmpty()) {
				cur = s.pop();
				array[i++] = cur.data;
				cur = cur.right;
			}
		}

		return array;
	}

	public static int nodeCount(AVLNode node) {
		if (node == null)
			return 0;
		return 1 + nodeCount(node.left) + nodeCount(node.right);

	}

	public int nodeCount() {
		return nodeCount(root);
	}

	public boolean search(int e) {
		AVLNode cur = root;
		while (cur != null) {
			if (cur.data == e)
				return true;
			if (cur.data > e)
				cur = cur.left;
			else
				cur = cur.right;
		}
		return false;

	}

}
