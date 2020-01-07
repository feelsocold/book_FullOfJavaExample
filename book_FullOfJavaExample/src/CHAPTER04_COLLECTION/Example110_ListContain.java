package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

// 110. List에 특정 요소의 포함 여부 조사하기

public class Example110_ListContain {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("B");
		System.out.println(list);
		

		List<String> list2 = new ArrayList<>();
		list.add("A");
		list.add("B");
		System.out.println(list);
		

		List<String> list3 = new ArrayList<>();
		list.add("A");
		list.add("C");
		System.out.println(list);
		
		// 지정한 요소가 List에 포함되어있는지 조사하기
		System.out.println(list.contains("A"));
		
		// 지정한 컬렉션의 모든 요소가 List에 포함되어 있는지 조사하기
		System.out.println(list.containsAll(list2));
		System.out.println(list.containsAll(list3));
		
		// 지정된 요소가 List 내에서 '처음으로' 검출된 인덱스를 반환한다.
		System.out.println(list.indexOf("C"));
		
		// 지정된 요소가 List에 없는 경우 -1을 반환한다.
		System.out.println(list.indexOf("E"));
		
		// 지정된 요소가 List 내에서 '마지막'으로 검출된 인덱스를 반환한다.
		System.out.println(list.lastIndexOf("B"));
		
		
	}

}
