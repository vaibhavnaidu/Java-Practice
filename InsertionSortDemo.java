//Insertion Sort Practice program. Iterative and recursive methods

public class InsertionSortDemo {

	// Insertion Sort Iterative algorithm
	public int[] insertionSortIterative(int a[]) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] < a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i = i - 1;
				}
			}
		}
		return a;
	}

	// Insertion Sort Recursive algorithm
	public int[] insertionSortRecursive(int a[], int n) {
		int i;
		if (n > 1)
			insertionSortRecursive(a, n - 1);
		else {
			int k = a[n];
			i = n - 1;
			while (i >= 0 && a[i] > k) {
				a[i + 1] = a[i];
				i = i - 1;
			}
			a[i + 1] = k;
		}
		return a;
	}
}
