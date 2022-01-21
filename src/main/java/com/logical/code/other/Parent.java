package com.logical.code.other;

import java.util.Arrays;
import java.util.List;

public class Parent {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("test1", "test2", "test3", "test4");
		System.out.println(list);
		list.add(3, "test6");
		System.out.println(list);
	}
	
}
