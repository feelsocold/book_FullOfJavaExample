package CHAPTER04_COLLECTION;
// 109. List 정렬하기

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection#sort() 메소드를 사용한다.
// 기본적으로 요소의 자연 순서화(String은 알파벳순, Integer는 수치순)에 따라 오름차순으로 정렬된다.
// 내림차순으로 정렬하고 싶은 경우는 정렬 후의 List를 Collections#reverse() 메소드로 반전시킨다.
public class Example109_ListSorting {

	public static void main(String[] args) {
	// * List를 오름차순으로 정렬한다.

		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("orange");
		list.add("blueberry");
		list.add("banana");
		
		// 오름차순으로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 내림차순으로 정렬
		Collections.reverse(list);
		System.out.println(list);
	
	// * Collection#sort() 메소드의 인수에 Comparator을 전달함으로써 자체적인 정렬규칙으로 List를 정렬할 수 있다.
	// * 문자열 길이에 의한 List 정렬 예
		// Collection.sort(list, new StringLengthComparator());
		
		
	
	
	
	}

}
