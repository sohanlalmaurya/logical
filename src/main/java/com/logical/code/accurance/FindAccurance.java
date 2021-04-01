package com.logical.code.accurance;

public class FindAccurance {

	public static void main(String[] args) {
		int[] arr = { 34, 34, 34, 3, 3, 4, 3, 5, 0, -1 };
		System.out.print("find all unique element findAccurance() = ");
		findAccurance(arr);
	}

	private static void findAccurance(int[] arr) {
		int[] freq = new int[30];
		for (int i = 0; i < arr.length; i++)
			freq[i] = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = 0;
				}
			}
			if (freq[i] != 0)
				freq[i] = count;
		}
		for (int i = 0; i < arr.length; i++)
			if (freq[i] == 1)
				System.out.print(arr[i] + " ");
	}
}
