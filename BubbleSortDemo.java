//Bubble Sort practice. Iterative and Recursive version

public class BubbleSortDemo {

	public int[] bubbleSortIterative(int a[]) {
		boolean flag = true;
		while (flag) {
			for (int i = 0; i < a.length - 1; i++) {
				flag = false;
				if (a[i] > a[i + 1]) {
					int tmp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = tmp;
					flag = true;
				}
			}
		}
		return a;
	}

	public int[] bubbleSortRecursive(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int tmp = a[i + 1];
				a[i + 1] = a[i];
				a[i] = tmp;
				bubbleSortRecursive(a);
			}
		}
		return a;
	}

	public void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
