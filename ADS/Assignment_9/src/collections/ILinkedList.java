package collections;

public interface ILinkedList<T>{
	
	void addAtFront(T e);
	
	void addAtRear(T e);
	
	Object[] getAllElements();
	
	T removeAtRear();
	
	T removeAtFront();
	
	void delete(T e);

	int countFrequency(T e);
	
}
