package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class Example105_ListSet {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// 인덱스 1의 요소를 "X로 변환
		list.set(1, "X");
		System.out.println(list);
		
		// List#replaceAll() 메소드에서 List 내의 모든 요소들을 람다식의 반환값으로 바꿀 수 있다.
		// 모든 요소를 소문자로 변환
		list.replaceAll(s -> s.toLowerCase());
		System.out.println(list);
		
		
	}

}
