package com.logical.code.accurance;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElement {

	private static int findByXOR(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		return result > 0 ? result : -1;
	}

	private static int findByMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			Integer occurrance = map.get(num);
			map.put(num, occurrance == null ? 1 : occurrance + 1);
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,3,4,5,6};

		System.out.println("Unique element findByXOR = " + findByXOR(arr));
		System.out.println("Unique element findByMap = " + findByMap(arr));
	}
}
