package collections;

// implement hash table with bucket size as 1

public class HashTableLinearProbed implements IHashTable {

	class Bucket {
		private int key;
		private boolean collision;

		public Bucket(int key) {
			this.setKey(key);
			setCollision(false);
		}

		public boolean isCollision() {
			return collision;
		}

		public void setCollision(boolean collision) {
			this.collision = collision;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

	}

	Bucket[] ht;
	int size;

	public HashTableLinearProbed(int size) {
		this.size = size;
		ht = new Bucket[size];

	}

	@Override
	public boolean add(int key) {
		int bucketId = hashFunctionModN(key);

		for (int i = 0; i < size; i++) {
			bucketId = linearProbe(bucketId, i);
			if (ht[bucketId] != null) {
				if (ht[bucketId].getKey() == key)
					return false;
				ht[bucketId].setCollision(true);
			} else {
				ht[bucketId] = new Bucket(key);
				return true;
			}
		}

		return false;
	}

	private int linearProbe(int bucketId, int i) {
		return (bucketId + i) % size;
	}

	private int hashFunctionModN(int key) {
		return key % size;
	}

	@Override
	public boolean search(int key) {
		int bucketId = hashFunctionModN(key);

		for (int i = 0; i < size; i++) {
			bucketId = linearProbe(bucketId, i);
			if (ht[bucketId] == null)
				return false;
			if (ht[bucketId].getKey() == key)
				return true;
			if (!ht[bucketId].isCollision())
				return false;
		}

		return false;
	}

	@Override
	public boolean delete(int key) {

		int bucketId = hashFunctionModN(key);

		for (int i = 0; i < size; i++) {
			bucketId = linearProbe(bucketId, i);
			if (ht[bucketId] == null)
				return false;
			if (ht[bucketId].getKey() == key) {
				ht[bucketId] = null;
				return true;
			}
			if (!ht[bucketId].isCollision())
				return false;
		}

		return false;
	}

}