package vijay;

import vijay.ArrayMaxMin.Pair;

public class ArrayMaxMin {

	static class Pair {
		int max;
		int min;
	}

	static Pair getMaxMin(int arr[], int n) {

		Pair minmax = new Pair();

		for (int i = 0; i < n; i++) {
			if (arr[i] > minmax.max) {
				minmax.max = arr[i];
			} else {
				minmax.min = arr[i];
			}
		}
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12,-13 };

		Pair minmax = getMaxMin(arr, 2);

		System.out.println(minmax.max);
		System.out.println(minmax.min);

	}

}
