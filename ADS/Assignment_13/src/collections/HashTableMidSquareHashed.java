package collections;

// implement hash table with bucket size as 1

public class HashTableMidSquareHashed implements IHashTable {

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

	public HashTableMidSquareHashed(int size) {
		this.size = size;
		ht = new Bucket[size];

	}

	@Override
	public boolean add(int key) {
		int bucketId = hashFunctionMidSquared(key);

		for (int i = 0; i < size; i++) {
			bucketId = quadraticProbe(bucketId, i);
			System.out.println("hash : "+bucketId+" for key : "+key);
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

	private int quadraticProbe(int bucketId, int i) {
		return (bucketId +2* i * i) % size;
	}

	private int hashFunctionMidSquared(int key) {
		if(key==0)
			key =(int)(10* Math.random());
		key = key*key;
		key = key/((int)Math.pow(10,Math.log10(key)/2));
		
		return key % size;
	}

	@Override
	public boolean search(int key) {
		int bucketId = hashFunctionMidSquared(key);

		for (int i = 0; i < size; i++) {
			bucketId = quadraticProbe(bucketId, i);
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

		int bucketId = hashFunctionMidSquared(key);

		for (int i = 0; i < size; i++) {
			bucketId = quadraticProbe(bucketId, i);
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