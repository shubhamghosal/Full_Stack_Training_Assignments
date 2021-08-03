package QueueArray;

public class QueueImpl implements QueueIntf {
	int arr[] = new int[100];
	int front = 0;
	int back = 0;

	@Override
	public void AddQ(int elem) {
		if (back == 100)
			System.out.println("Queue is full");
		else
			arr[back++] = elem;
	}

	@Override
	public int DeleteQ() {
		if (IsEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		int elem = arr[0];
		for (int i = 0; i < back - 1; i++)
			arr[i] = arr[i + 1];
		back--;
		return elem;
	}

	@Override
	public boolean IsEmpty() {
		if (front == back)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		if (back == 100)
			return true;
		return false;
	}

}
