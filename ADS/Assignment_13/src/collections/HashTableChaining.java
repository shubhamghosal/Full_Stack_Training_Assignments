package collections;

// implement hash table with bucket size as 1

public class HashTableChaining implements IHashTable {

	class Bucket {
		private AVLTree tree;
		private boolean collision;

		public Bucket() {
			tree = new AVLTree();
			setCollision(false);

		}

		public boolean add(int key) {
			return tree.insert(key);

		} // implement chaining technique

		public boolean search(int key) {
			return tree.search(key);
		}

		public boolean delete(int key) {
			return tree.delete(key);
		}

		public boolean isCollision() {
			return collision;
		}

		public void setCollision(boolean collision) {
			this.collision = collision;
		}
	}

	Bucket[] ht;
	int size;

	public HashTableChaining(int size) {
		this.size = size;
		ht = new Bucket[size];
	}

	private int hashFunctionModN(int key) {
		return key % size;
	}

	@Override
	public boolean add(int key) {
		int bucketId = hashFunctionModN(key);
		
		 
		 
		if (ht[bucketId] != null) {
			ht[bucketId].setCollision(true);
		} else {
			ht[bucketId] = new Bucket();
		}

		return ht[bucketId].add(key);
	}

	/*
	 * private int linearProbe(int bucketId, int i, int size) { return (bucketId +
	 * i)%size; }
	 */

	@Override
	public boolean search(int key) {
		int bucketId = hashFunctionModN(key);
		if(ht[bucketId]==null)
			return false;
		return ht[bucketId].search(key);
	}

	@Override
	public boolean delete(int key) {
		int bucketId = hashFunctionModN(key);
		if(ht[bucketId]==null)
			return false;
		return ht[bucketId].delete(key);
	}

}
