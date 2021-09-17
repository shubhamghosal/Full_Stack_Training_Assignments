package DoublyLinkedList;


public interface LinkedListIntf {
	public void AddAtFront(int element);
	public void AddAtRear(int element);
	public int[] GetAllElements();
	public int[] GetAllElementsInReverseOrder();
	public void Delete(int element);
}
