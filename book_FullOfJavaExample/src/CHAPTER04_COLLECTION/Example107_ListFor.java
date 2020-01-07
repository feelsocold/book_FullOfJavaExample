package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

// 107. List 요소를 반복 처리하

// forEach()메소드를 사용하여 람다식으로 반복 처리를 기술할 수 있다.
public class Example107_ListFor {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		// 확장 for문을 사용하는 경우
		for (String v : list) {
			System.out.print("(" + v + ")");
		}
		System.out.println();
		
		// foreach 메소드를 사용한 경우
		list.forEach( s -> System.out.print("[" + s + "]"));
		
		
	}

}
