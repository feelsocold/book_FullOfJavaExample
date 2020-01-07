package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

// 111. 2개의 List 연결하기

// List#addAll() 메소드를 사용한다.
public class Example111_ListAddAll {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		List<String> list2 = new ArrayList<>();
		list2.add("X");
		list2.add("Y");
		list2.add("Z");
		
		// list + list2
		list.addAll(list2);
		System.out.println(list);
		
		// list 인덱스 2번째에 list2 추가
		list.addAll(2, list2);
		System.out.println(list);
		
	}

}
