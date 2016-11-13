//Binary Search practice. Expects a sorted list as input

public class BinarySearchDemo {

	public int binarySearch(int data, int list[]) {
		return binarySearch(list, 0, list.length - 1, data);
	}

	private int binarySearch(int a[], int start, int end, int data) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			if (data < a[mid]) {
				return binarySearch(a, start, mid, data);
			} else if (data > a[mid]) {
				return binarySearch(a, mid + 1, end, data);
			} else
				return mid;
		}
		return -1;
	}

}
