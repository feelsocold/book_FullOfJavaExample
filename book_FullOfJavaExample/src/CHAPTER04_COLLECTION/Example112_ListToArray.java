package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 112. List와 배열을 상호 변환하기

// List를 배열로 변환하는 경우는 List#toArray() 메소드를 사용한다.
// 형 안전성을 확보하기 때문에 인수로 List요소의 저장 장소의 배열을 지정한다.

public class Example112_ListToArray {

	public static void main(String[] args) {
	// * List를 배열로 변환하기

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		// 형 안전성을 위하여 인수가 있는 toArray 메소드를 이용한다.
		String[] array = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(array));
		
	// 반대로 배열을 List로 변환하는 경우는 Arrays#asList() 메소드를 사용한다.
		
		// * 배열을 List로 변환하기
		String[] array2 = { "A", "B", "C", "D"};
		
		List<String> list2 = Arrays.asList(array2);
		System.out.println(list2);
		
	// ~ Array#asList() 메소드를 이용하여 List 생성하기
		List<String> list3 = Arrays.asList("apple", "orange", "banana");
		System.out.println(list3);
	}

}
