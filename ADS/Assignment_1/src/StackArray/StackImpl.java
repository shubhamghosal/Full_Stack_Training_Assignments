package StackArray;

public class StackImpl implements StackIntf {
	private int arr[];
	private int top;
	private int size;

	public StackImpl(int c) {
		super();
		this.size = c;
		this.arr = new int[c];
		this.top = -1;
	}

	@Override
	public void Push(int elem) {
		if (top >= size) {
			System.out.println("Stack Overflow\nProgram Terminated\n");
			System.exit(1);
		}
		System.out.println("Inserting " + elem);
		arr[++top] = elem;
	}

	@Override
	public int Pop() {
		if (IsEmpty()) {
			System.out.println("Stack Underflow\nProgram Terminated");
			System.exit(1);
		}
		int popper = arr[top];
		top--;
		System.out.println("Popped element:" + popper);

		return arr[top--];
	}

	@Override
	public boolean IsEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		if (top >= size - 1)
			return true;
		return false;
	}
}
