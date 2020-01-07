package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

// 108. List 요소 수 구하기

public class Example108_ListSize {

	public static void main(String[] args) {
		
	// * List의 요소 수 구하기

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list.size());
		
	}

}
