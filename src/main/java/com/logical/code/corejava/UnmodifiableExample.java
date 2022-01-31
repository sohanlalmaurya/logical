package com.logical.code.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("TEST1","TEST2","TEST3","TEST4");
		System.out.println(list);
		
		List<String> immutable = Collections.unmodifiableList(list);
		immutable.add("TEST5");
		System.out.println(immutable);
	}
		
}
