package com.app.core;

public class CircularQueue {
	int size;
	int front, rear;
	int items[];

	public CircularQueue(int s) {
		items = new int[s];
		size = s;
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % size;
			items[rear] = element;
			System.out.println("Inserted " + element);
		}
	}

	public int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			element = items[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return (element);
		}
	}
}
