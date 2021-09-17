package com.app.hanoi;

@SuppressWarnings("unchecked")
public class StackImpl<T> implements IStack<T> {

	int size;
	public Object[] stack;
	int top;

	public StackImpl(int size) {
		this.size = size;
		top = -1;
		stack = (T[]) new Object[size];

	}

	@Override
	public T pop() {
		if (isEmpty())
			return null;
		return (T) stack[top--];
	}

	@Override
	public void push(T e) {
		if (isFull())
			return;
		stack[++top] = e;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == size - 1;
	}

	@Override
	public T peek() {
		if (isEmpty())
			return null;
		return (T) stack[top];
	}

	@Override
	public String toString() {
		if(top==-1)
			return "[]";
		StringBuilder s = new StringBuilder("[ ");
		for (int i = 0; i<=top; i++)
			s.append(stack[i] + ", ");
		s.replace(s.length() - 2, s.length(), " ]");
		return s.toString();
	}

}
