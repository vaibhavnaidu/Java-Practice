import java.util.Arrays;

// This program has hash tables with linear probing

public class HashTableLinearProbing {

	int length, hashKey, HT[];

	public HashTableLinearProbing(int length, int key) {
		this.length = length;
		this.hashKey = key;
		HT = new int[length];
		Arrays.fill(HT, -1);
	}

	public void insertHT(int data) {
		int hashed = data % hashKey;
		if (HT[hashed] == -1)
			HT[hashed] = data;
		else {
			while (HT[hashed] != -1) {
				System.out.println("collision at " + hashed + " for value "
						+ data);
				hashed++;
			}
			HT[hashed] = data;
		}
	}

	public int searchHT(int data) {
		int hashed = data % hashKey;
		if (HT[hashed] == data)
			return hashed;
		else {
			while(hashed < length && HT[hashed]!= -1) {
				hashed++;
				if (HT[hashed] == data)
					return hashed;
			}
		}

		return -1;
	}

}
